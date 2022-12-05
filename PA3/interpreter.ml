module F = Format

let rec interp_expr (e: Ast.expr) (g: FStore.t) (s: Store.t) : Value.t = 
 (* Implement this function *)
 let asint (v: Value.t) : int = 
  match v with
  | NumV v -> v
 in
  match e with
  | Num n -> NumV n
  | Add (e1, e2) -> NumV( asint (interp_expr e1 g s) + asint (interp_expr e2 g s))
  | Sub (e1, e2) -> NumV( asint(interp_expr e1 g s) - asint (interp_expr e2 g s))
  | Id x -> 
    begin
    match Store.mem x s with
    | true -> Store.find x s
    | false -> let str = Printf.sprintf "Free identifier: %s" x in 
      failwith str
    end
  | LetIn(x, e1, e2) -> 
    let rst = interp_expr e1 g s in
    let new_s = Store.add x rst s in
    interp_expr e2 g new_s
  | Call (x, el) -> 
    let vl = List.map (fun k -> interp_expr k g s) el in
    let rm_hd li =
      match li with
      | [] -> []
      | _::t -> t
    in

    begin
    match FStore.mem x g with
    | true -> 
      let (pl, e2) = FStore.find x g in 
      if List.length vl <> List.length pl then 
        let str = Printf.sprintf "The number of arguments of %s mismatched: Required: %d, Actual: %d" x (List.length pl) (List.length vl) in failwith str
      else 
        let rec update_store var_mem arg_li param_li =
        if List.length arg_li = 0 then var_mem
        else
          let tmp = Store.add (List.hd param_li) (List.hd arg_li) var_mem in
          update_store tmp (rm_hd arg_li) (rm_hd param_li)
        in interp_expr e2 g (update_store s vl pl)
    | false -> let str = Printf.sprintf "Undefined function: %s" x in failwith str
    end
    
  


let interp_fundef (d: Ast.fundef) (g: FStore.t) : FStore.t = 
 (* Implement this function *)
 match d with
 | FunDef (x, pl, e) -> FStore.add x (pl,e) g

let interp (p: Ast.prog) : Value.t = 
 (* Implement this function *)
 let g = FStore.empty in
 let s = Store.empty in

 match p with
  | Prog (dl, e) -> 
    let rec update mem li =
      match li with
      | [] -> mem
      | h :: t -> update (interp_fundef h mem) t
    in 
    let g' = update g dl in 
    interp_expr e g' s
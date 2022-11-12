let prime n = 
  let rec check a i =
    if i>1 then
      match a mod i with
      | 0 -> false
      | _ -> check a (i-1)
    else
      true
    in
  match n with
  | 0 -> false
  | 1 -> false
  | _ -> check n (n-1)
;;

Format.printf "%B\n" (prime 2);
;;
Format.printf "%B\n" (prime 3);
;;
Format.printf "%B\n" (prime 4);
;;
Format.printf "%B\n" (prime 17);
;;
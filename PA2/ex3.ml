let sec_last li = 
  let idx li =
    if List.length li - 2 >= 0 then List.length li - 2
    else -1 in
  match idx li with
  | -1 -> 0
  | _ -> List.nth li (idx li)
;;


Format.printf "%d\n" (sec_last [1;2;3;4;5]);
;;
Format.printf "%d\n" (sec_last [4;3;2;1]);
;;
Format.printf "%d\n" (sec_last []);
;;
Format.printf "%d\n" (sec_last [1]);
;;
Format.printf "%d\n" (sec_last [1;2]);
;;
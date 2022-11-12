let merge li1 li2 =
  let li = List.append li1 li2 in
  let li = List.sort compare li in
  let li = List.rev li in li
;;


print_string "[";;
print_string (String.concat ";" (List.map string_of_int (merge [3;2;1] [5;4])));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (merge [5;3] [5;2])));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (merge [4;2] [])));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (merge [] [2;1])));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (merge [] [])));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (merge [0;0;0;0] [0;0;0;0])));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (merge [4;3;-2] [9;7;7])));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (merge [-2;-999] [])));;
print_string "]\n";;
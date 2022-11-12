let rec range lower upper =
  if lower > upper then []
  else lower :: range (lower+1) upper
;; 

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (range 10 15)));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (range (-2) 7)));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (range 9 3)));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (range 22 22)));;
print_string "]\n";;

print_string "[";;
print_string (String.concat ";" (List.map string_of_int (range 55 (-12))));;
print_string "]\n";;
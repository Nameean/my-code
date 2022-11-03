echo "$fact Enter 3 Numbers"
read a
read b
read c
if (($a>$b && $a>$c))
   then
      echo "$a is the largest Number"
   elif (($b>$a && $b>$c))
   then
      echo "$b is the largest Number"
   else
      echo "$c is the largest Number"
   fi

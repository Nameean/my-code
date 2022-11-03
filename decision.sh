
echo ----------------------------------- 
echo 'Student Mark List' 
echo ----------------------------------- 
echo Enter the Student name 
read name 
echo Enter the Register number 
read rno 
echo Enter the OSY 
read m1 
echo Enter the ACN
read m2 
echo Enter the EST
read m3 
echo Enter the AJP
read m4 
echo Enter the STE
read m5 
tot=$(expr $m1 + $m2 + $m3 + $m4 + $m5) 
avg=$(expr $tot / 5) 
echo ----------------------------------- 
echo 'Student Mark List' 
echo ----------------------------------- 
echo "Student Name    : $name" 
echo "Register Number : $rno" 
echo "OSY             : $m1" 
echo "ACN             : $m2" 
echo "EST             : $m3" 
echo "AJP             : $m4" 
echo "STE             : $m5" 
echo "Total           : $tot" 
echo "Average         : $avg" 
if [ $m1 -ge 08 ] && [ $m2 -ge 08 ] && [ $m3 -ge 08 ] && [ $m4 -ge 08 ] && [ $m5 -ge 08 ] 
then 
 echo "Result          : Pass" 
  
 if [ $avg -ge 18 ]
 then
  echo "Grade           : A"
 elif [ $avg -ge 15 ] 
 then 
         echo "Grade           : B" 
 elif [ $avg -ge 10 ] 
 then 
         echo "Grade           : C" 
 elif [ $avg -ge 08 ] 
 then 
         echo "Grade           : D" 

 fi 
else 
 echo "Result          : Fail" 
fi 
echo -----------------------------------

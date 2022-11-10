rows=5
for((i=0; i<=rows; i++))
do
  #for((j=1; j<=rows - i; j++))
 # do
  #  echo -n "  "
 # done
  for((j=1; j<=2*i - 0; j++))
  do
    echo -n "*"
  done
  for((j=1; j<=rows - i; j++))
  do
    echo -n "*"
done
  echo
done

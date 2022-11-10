number=1
rows=5
for((i=rows; i>=1; i--))
do
  for((j=1; j<=i; j++))
  do
    echo -n "*"
  done
  number=1
  echo
done

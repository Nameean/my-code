import random
characters="abcdefghijklmnpoqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%_*&^"
while True:
    pass_length= int(input("enter the length of requried password:"))
    
    pass_count= int(input("enter the number of requried password:"))
    
    for i in range (0,pass_count):
        password=""
        for j in range (0,pass_length):
            pass_char=random.choice(characters)
            password=password+pass_char
        print("The generated password is",password)
    repeat =input("Do you want to generats more password?")
    if repeat =="no" or repeat == "NO":
        break
print("Thank you")

# a=['a',2,3,4]
# b=pickle.dumps(a)
# print(b)
# c=pickle.loads(b)
# print(c)

# with open("ab.txt","wb") as f:
#     a={1:3,2:4}
#     b=pickle.dump(a,f)

# with open("ab.txt","rb") as f:
#     c=f.read()
#     print(c)

# with open("ab.txt","rb") as f:
#     c=pickle.load(f)
#     print(c)

# f=open("vibak.txt","wb")
# a={1:3,4:6}
# pickle.dump(a,f)

# f.close()

# f=open("vibak.txt","rb")
# print(f.read())
# f.close()
# f=open("vibak.txt","rb")

# print(pickle.load(f))
# f.close()


# f.close()

# a={1:2,3:4,5:6}
# print(a.pop(3))
# print(a)
# a[3]="apple"
# print(a)

# Remove the bad characters from the given string. Given bad_char[";",":","*","!"] string="py:th!o:n;py*t*h!:o" expected output="pythonpython"
# a=[";",":","*","!"]
# b="py:th!o:n;py*t*h!:o!!n"
# c=""
# for i in b:
#     if i not in a:
#         c=c+i
# print(c.replace(" ",""))


# write a python program to check given number is armstrong or not using for loop.
 
# a=int(input("Enter : "))
# b=len(str(a))
# c=0
# d=a
# for i in range(b):
#     r=a%10
#     c=c+r**b
#     a=a//10
# if c==d:
#      print(True)
# else:
#      print(False)

# a=int(input("Enter: "))
# b=len(str(a))
# c=0
# d=a
# i=0
# while i<b:
#     r=a%10
#     c=c+r**b
#     a=a//10
#     i+=1
# if c==d:
#     print(True)
# else:
#     print(False)

# Write a python program that accepts a string and calculate the no. of digit, number, letters and space using for loop
# a=input("enter: ")
# d=0
# l=0
# s=0
# for i in a:
#     if i.isdigit():
#         d+=1
#     elif i.isspace():
#         s+=1
#     else:
#         l+=1
# print("space= ",s, d, l)

# Write a program to find a factoraial of a given number using while loop
# n=1
# a=int(input("Enter: "))
# while a!=0:
#     n=n*a
#     a=a-1
# print(n)

# def fact(n):
#     if n==0:
#         return 1
#     else:
#         return n* fact(n-1)
# a=int(input("en: "))
# print(fact(a))

#PRIME NUMBER
# def p(n):
   
#     for i in range(2,n):
#         if n%i == 0:
#             print("not prime")
#             break
#         else:
#             print("prime")
#             break
# a=int(input("Enter: "  ))
# p(a)

# Write a python program to display all the prime numbers within a given range using while loop.
# a=int(input("Enter start"))
# b=int(input("Enter end"))
# for n in range(a,b):
#     if n>1:
#         for i in range(2,n):
#             if n%i==0:
#                 break
#         else:
#             print(n)

# f= open("login.txt","w")
# a="vinak "
# f.write(a)
# f.close()
# f=open("login.txt","r")
# x=f.read()
# f.close()

# f=open("registration.txt","w")
# f.write(x)
# f.close()
# f=open("registration.txt","r")
# # print(f.read())


# f=open("XXX.txt","w")
# a="nigachan"

# f.write(a)

# f.close()

# f=open("XXX.txt","r")
# x=f.read()
# print(x)
# f.close()

# f=open("YYY.txt","w")
# f.write(x)
# f.close()

# f=open("YYY.txt",'r')
# print(f.read())



# Reverse  a string using recursion and forloop.
# a=input("enter string")
# b=" "
# for char in reversed(a):
#     b+=char
# print(b)

# a=['binak',1,222,3,478]
# b=[]
# for i in range(len(a),0,-1):
#     b.append(a[i-1])
# print(b)

# Write a function words() in python to read lines from a text file "story.txt", and display those words, which are less tha 4 charaters.

# f=open("story.txt","w")
# f.write("once upon a time there was a king named vinak.\n he was very dark and was known as Chandra graha.")
# f.close()
# f=open("story.txt",'r')
# x=f.readlines()
# print(x)

# def word():
#     f=open("story.txt",'r')
#     x=f.readlines()
#     for i in x:
#         v=i.split()
#         for j in v:
#             if len(j)<4:
#                 print(j)    
# word()


# f=open("story.txt","w")
# f.write("once upon a time there was a king named vinak.\n he was very dark and was known as Chandra graha.")
# f.close()

# f=open("story.txt",'r')
# x=f.readlines()
# def words():
#     for i in x:
#         l=i.split()
#         for j in l:
#             if len(j)<4:
#                 print(j)
# words()
# f.close()

# How can you randomise the items of a list in place in Python?

# from random import *
# a=[1,2,3,3,4,5,6,6]
# shuffle(a)
# print(a)

# import pickle
# a=[1,2,34]
# b=pickle.dumps(a)
# print(b)
# c=pickle.loads(b)
# print(c)
# f=open("kaley.txt","wb")
# a="[1,2,3,4]"
# pickle.dump(a,f)
# f.close()

# f=open("kaley.txt","rb")
# z=f.read()
# print(z)

# f=open("kaley.txt","rb")
# b=pickle.load(f)
# print(b)

#BINARY SEARCH

# def search(arr,tar):
#     left,right=0,len(arr)-1
#     while left<=right:
#         mid=(left+right)//2
#         if arr[mid]==tar:
#             return mid
#         elif arr[mid]<tar:
#             left=mid+1
#         else:
#             right=mid-1
#     return -1
# print(search(["a","bv","c","5","f","b"],"bbbb"))

#factorial while
# def fact(n):
#     i=1
#     while n!=0:
#         i=n*i
#         n-=1
#     print(i)
# fact(5)

# def fact(n):
#     if n==0:
#         return 1
#     else:
#         return n* fact(n-1)
# print(fact(5))


# #no of string
# a=input("Enter: ")
# s=0
# l=0
# n=0
# for i in a:
#     if i.isspace():
#         s+=1
#     elif i.isdigit():
#         n+=1
#     else:
#         l+=1
# print(s,n,l)

# a=int(input("enter:"))
# b=int(input("enter:"))
# for num in range(a,b):
#    if num>1:
#         for i in range(2,num):
#             if num%i==0:
#                break
#         else:
#             print(num)

# with open("hello.txt","w") as f:
#     f.write("hi")

# with open("hello.txt","r") as f:
#     print(f.read())

# def rev(n):
#     if len(n)==0:
#         return n
#     else:
#         return rev(n[1:])+n[0]
# print(rev(input("enter: ")))

# #FIBONACCI
# a=1
# b=1
# c=1
# for i in range(10):
#     print(b)
#     a=b
#     b=c
#     c=a+b

##1
# try:
#     n=int(input("ENTER: "))
#     a=9/n
# except:
#     print("Error ")
# else:
#     print(f"Answer is {a}")
# finally:
#     print("NIGA")

# #2
# try:
#     n=int(input("Enter: "))
#     a=9/n
# except ZeroDivisionError:
#     print("infinity error")
# except ValueError:
#     print("Enter an integer")

#3
# try:
#     a=int(input("Enter: "))
#     b=a+2
# except ValueError:
#     print("enter an integer")
# else:
#     print("answer is ",b)

#RAISE-     keyword which is used to raise exceptions manually by the user.
# x=int(input("Enter: "))
# if x>2:
#     raise ValueError("this is custom error")

#Assert- tool used for debugging, check if condition is True or not, if False, AssertionError
# a=int(input("Etn"))
# assert a>2,"EROR404"

# #BINARY SEARCH
# def search(a,b):
#     l,r=0,len(a)-1
#     while l<=r:
#         m=(l+r)//2
#         if a[m]==b:
#             return m
#         elif a[m]<b:
#             l=m+1
#         else:
#             r=m-1
#     return -1
# print(search([51,53,64,71,88,90],71))

#Linear
# def search(a,b):
#     for i in range(len(a)):
#         if a[i]==b:
#             return i
#     return -1
# print(search([213,43,2,4,11,66],11))

# a=int(input("Enter"))
# b=int(input("Enter"))
# for i in range(a,b):
#     if i>1:
#         for n in range(2,i):
#             if i%n==0:
#                 break
#         else:
#             print(i)

# def prime(n):
#     for i in range(2,n):
#         if n%i==0:
#             return "not prime"
#         else:
#             return "prime"
# a=int(input("Enter"))
# print(prime(a))

# import pickle
# a="BINAK"
# b=pickle.dumps(a)
# print(b)
# c=pickle.loads(b)
# print(c)

# with open("HEROFIS.txt","wb") as f:
#     a="viak"
#     pickle.dump(a,f)
# with open("HEROFIS.txt","rb") as f:
#     z=f.read()
#     print(z)
# with open("HEROFIS.txt","rb") as f:
#     c=pickle.load(f)
#     print(c)
# with open("OG.txt","w") as f:
#     a="asdb asd  fd d sd dft wer dfsds"
#     f.write(a)
# def words():
#     with open("OG.txt","r") as f:
#         x=f.readlines()
#         for i in x:
#             c=i.split()
#             for j in c:
#                 if len(j)<4:
#                     print(j)
# words()

# def rev(n):
#     if len(n)==0:
#         return n
#     else:
#         return rev(n[1:])+n[0]
# a=input("ENTER:")
# print(rev(a))

# a=input("ENTER:")
# b=""
# for i in reversed(a):
#     b+=i
# print(b)


# a=int(input("ENTER"))
# b=""
# c=len(str(a))
# d=str(a)
# for i in range(c):
#     r=a%10
#     x=str(r)
#     b+=x 
#     a=a//10
# print(b)
# if b==d:
#     print("palindrome")
# else:
#     print("not")  

# def lin(a,b):
#     for i in range(len(a)):
#         if a[i]==b:
#             return i
#     return -1
# print(lin([1,23,4,45,3,232],3))
# def bin(a,b):
#     l,r=0,len(a)-1
#     while l<=r:
#         m=(l+r)//2
#         if a[m]==b:
#             return m
#         elif a[m]<b:
#             l=m+1
#         else:
#             r=m-1
#     return -1
# print(lin([1,23,4,45,33,3,232],3))
# def fact(n):
#     if len(n)==0:
#         return n
#     else:
#         return fact(n[1:])+n[0]
# print(fact("HELO"))


# with open("Herofish.txt","w") as f:
#     a="herofish vinak"
#     f.write(a)

# with open("Herofish.txt","r") as f:
#     x=f.read()


# with open("fis.txt","w") as f:
#     f.write(x)

# with open("fis.txt","r") as f:
#     z=f.read()
#     print(z)

# a=int(input("ENTER"))
# b=int(input("ENTER"))
# for i in range(a,b):
#     if i>0:
#         for n in range(2,i):
#             if i%n==0:
#                 break
#         else:
#             print(i)

#Write a program to find a factoraial of a given number using while loop.
# def fact(n):
#     i=1
#     while n!=0:
#         i*=n
#         n-=1
#     print(i)
# fact(5)


# Write a python program to display all the prime numbers within a given range using while loop.

# for n in range(0,10):
#     if n>1:
#         for i in range(2,n):
#             if n%i==0:
#                 break
#         else:
#             print(n)
    
# write a python program to check given number is armstrong or not using for loop.
# a=int(input("EN: "))
# b=0
# c=len(str(a))
# d=a
# for i in range(c):
#     r=a%10   
#     b+=r**c
#     a//=10
# if b==d:
#     print("Armstrong")
# else:
#     pass 
# Reverse  a string using recursion and forloop.
# a=input("ENRE")
# b=""
# for i in reversed(a):
#     b+=i
# print(b)

# # Explain the working process of linear search and binary search.
# def lin(a,b):
#     for i in range(len(a)):
#         if a[i]==b:
#             return i
#     return -1
# print(lin([1,2,3,4,5,3,22],22))

# def bin(a,b):
#     l,r=0,len(a)-1
#     while l<=r:
#         m=(l+r)//2
#         if a[m]==b:
#             return m
#         elif a[m]<b:
#             l=m+1
#         else:
#             r=m-1
#     return -1
# print(bin([2,4,12,90,1999],90))

# a=int(input("ENTER: "))
# b=""
# c=len(str(a))
# for i in range(c):
#     r=a%10
#     s=str(r)
#     b+=s
#     a=a//10
# print(b)

# a=1
# b=1
# c=1
# n=int(input("enter: "))
# for i in range(n):
#     print(b)
#     a=b
#     b=c
#     c=a+b

# import pickle
# a="hero fis"
# b=pickle.dumps(a)
# print(b)
# c=pickle.loads(b)
# print(c)

# with open("Herofis.txt","wb") as f:
#     a="hello world"
#     pickle.dump(a,f)

# with open("Herofis.txt","rb") as f:
#     f.read()

# with open("Herofis.txt","rb") as f:
#     z=pickle.load(f)
#     print(f)


with open("Hellow.txt","w") as f:
    a="i see a little boy sitting on the floor"
    f.write(a)
def words():
    with open("Hellow.txt","r") as f:
        x=f.readlines()
        for i in x:
            c=i.split()
            for j in c:
                if len(j)<4:
                    print(j)
words() 
#!/usr/bin/python3

str = "Hello World"

print (str)

print(str[0])
print(str[2:5])
print(str[2:])
print(str*3)
print(str + "TEST")

#python list

list = ["abcd", 4.5, 353, "john",78.8]
tinylist = [123,"john"]

print (list)
print (list[0])
print (list[1:3])
print (list[2:])
print (tinylist*2)
print (list+tinylist)

#tuples


tuple = ("arun", 1239,245.00, "prajapati")

print (tuple)
print (tuple[1])
print (tuple[2:4])

print (tuple*2)

list[0]=4334 #valid
#tuple[0]=7888 #not valid 


#dictionary

Dic={}

Dic ['one']="secrate"
Dic [2]="hello"
Dic ["arun"]=1234

print (Dic["arun"])

print (Dic.keys())  #pritn all the keys
print (Dic.values()) #print all values

tinydic= {"hjdsh":1234,"two":"arun", "two":9890, "two":"chutiya"}

print(tinydic)
print(len(tinydic))

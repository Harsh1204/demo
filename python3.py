#!/usr/bin/python3

import sys

var = 100

if (var == 100):print("value of var is 100")

print("bye")

list = ["apple", "orange", "grapes", "banana"]

it = iter(list)

#for x in it:
#	print (x)

while True:
	try:
		print(next(it), "in while loop")
	except StopIteration:
		sys.exit()

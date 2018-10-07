'''
Using the Python language, have the function CheckNums(num1,num2) take both parameters being passed and return the string true if num2 is greater than num1, otherwise return the string false. If the parameter values are equal to each other then return the string -1. 
'''
def CheckNums(num1,num2):
	if num1 > num2:
		num1 = "true"
	elif num1 < num2:
		num1 = "false"
	else:
		num1 = "-1"
	return num1

num1 = input("pick a number")
num2 = input("pick another")
    
# keep this function call here  
print (CheckNums(num1,num2))



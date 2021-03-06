'''Using the Python language, have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable 
sequence by either returning the string true or false. The str parameter will be composed of + and = symbols 
with several letters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol.
 So the string to the left would be false. The string will not be empty and will have at least one letter. 
'''

def SimpleSymbols(str):
	index = 0
	letters = 0
	success = 0
	while index < (len(str) -1):
		currentChar = str[index]
		if currentChar != "+" and currentChar!="=":
			letters = letters + 1
			if str[index + 1] == "+" and str[index - 1] == "+":
				success = success + 1
				index = index + 1
			else:
				index = index + 1
		else:
			index = index + 1
	if letters == success:
		str = "true"
	else:
		str = "false"
	return str
	
	


# keep this function call here  
print (SimpleSymbols(input("Type a string with only letters, +, and -")))
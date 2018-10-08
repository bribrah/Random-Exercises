'''Using the Python language, have the function KaprekarsConstant(num) take the num parameter being passed which will be a 4-digit number with at least two distinct digits. Your program should perform the following routine on the number: Arrange the digits in descending order and in ascending order (adding zeroes to fit it to a 4-digit number), and subtract the smaller number from the bigger number. Then repeat the previous step. Performing this routine will always cause you to reach a fixed number: 6174. Then performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174). Your program should return the number of times this routine must be performed until 6174 is reached. For example: if num is 3524 your program should return 3 because of the following steps: (1) 5432 - 2345 = 3087, (2) 8730 - 0378 = 8352, (3) 8532 - 2358 = 6174. 
'''

def Kaprekars(num):
	strNum = str(num)
	turns = 0
	if len(strNum) < 4:
		strNum = strNum + "0"
	while strNum != "6174":
		sortedNumString = sorted(strNum)
		sortedNum = int(("").join(sortedNumString))
		reveseNumString= sorted(strNum, reverse = True)
		reverseNum = int(("").join(reveseNumString))

		if sortedNum > reverseNum:
			turns = turns +1
			num = sortedNum - reveseNum
			strNum = str(num)
			
		else:
			turns = turns + 1
			num = reverseNum - sortedNum
			strNum = str(num)
	return turns



print (Kaprekars(int(input("type a number that has a max of 4 numerals"))))
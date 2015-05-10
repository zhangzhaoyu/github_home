#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

def judgePerfectNum(number):
    divisor = 1
    sumOfDivisors = 0
    while divisor < number:
        if number % divisor == 0:
            sumOfDivisors += divisor
        divisor += 1

    if number == sumOfDivisors:
        print number, "is perfect!!"
    elif number < sumOfDivisors:
        print number, "is abundant!!"
    else:
        pass
        #print number, "not perfect!!"

def collatzGuess():
    num = raw_input("enter a number:")
    count = 0

    print "start with number :" num
    print "sequence is :"

    while num > 1:
        if num % 2 == 1:
            num = num * 3 + 1
        else:
            num = num/2

        print num, ","
        count += 1
    else:
        print
        print "sequence is ", count, "numbers long."

if __name__ == "__main__":
    number = int(raw_input("input the top number:"))
    theNum = 2
    while theNum < number:
        judgePerfectNum(theNum)
        theNum += 1

    print "finshed.."


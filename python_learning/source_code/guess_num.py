#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28
import random as random
import math as math

def computeSqrt():
    num_str = raw_input("find the square root of integer:")
    while not num_str.isdigit():
        print "pay attention"
        num_str = raw_input("find the square of integer: ")

    number_int = int(num_str)

    guess_str = raw_input("initial guess:")
    while not guess_str.isdigit():
        print "pay attention"
        guess_str = raw_input("initial guess:")
    guess_float = float(guess_str)

    originalGuess_float = guess_floatl
    count_int = 0

    tolerance_float = float(raw_input("what tolerance :"))

    previous_float = 0
    while math.fabs(previous_float - guess_float) > tolerance_float:
        previous_float = guess_float
        quotient = number_int /guess_float
        guess_float = (quotient + guess_float) / 2
        count_int += 1

    print "square root of ", number_int, "is :", guess_float
    print "Took ", count_int, "reps to get it to tolerance: " , tolerance_float
    print "starting from a guess of :", originalGuess_float

def guess_num():
    number = random.randint(0, 100)
    print "Number guessing game : between 0 and 100 inclusive."

    guessNum = int(raw_input("Guess a number:"))
    while 0 <= guessNum <=100:
        if guessNum > number:
            print "Guess too high."
        elif guessNum < number:
            print "Giess too small."
        else:
            print "You guessed it, The number is :", number
            break

        guessNum = int(raw_input("Guess a number:"))
    else:
        print "You quit early, the number was :", number

if __name__ == "__main__":
    guess_num()

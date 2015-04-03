#! /usr/bin/env python

def sumN(n) :
    sum = 0
    for i in range(1, n + 1) :
        sum += i
    return sum

def sumWiseN(n) :
    sum = ((n + 1) * n) / 2
    return sum

if __name__ == '__main__'  :
    print sumWiseN(100)

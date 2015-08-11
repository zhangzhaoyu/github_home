#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-19

import string

__author__ = "zhangzhaoyu"


class MyClass(object):
    def __init__(self, val):
        self.value = val

    def __str__(self):
        return "val is : %s" %(self.value)

    def __add__(self, param2):
        sum = self.value + param2.value
        return MyClass(sum)

class Rational(object):
    """implements a rational number"""
    def __init__(self, number, denom = 1):
        self.number = number
        self.denom = denom

    def __str__(self):
        return str(self.number) + "/" + str(self.denom)

    def __repr__(self):
        return self.__str__()

    def __add__(self, f):
        if type(f) == int:
            f = Rational(f)
        if type(f) == Rational:
            theLcm = self.lcm(self.denom, f.denom)
            numeratorDiff = (theLcm / self.denom * self.number) + (theLcm / f.denom * f.number)
        return Rational(numeratorDiff, theLcm)

    def __radd__(self, f):
        return self.__add__(f)7

    def __sub__(self, f):
        theLcm = self.lcm(self.denom, f.denom)
        numeratorDiff = (theLcm / self.denom * self.number) - (theLcm / f.denom * f.number)
        return Rational(numeratorDiff, theLcm)

    def gcd(self, a, b):
        """calculate the greatest common divisor of two positive int."""
        if a > b:
            a, b = b, a
        while b != 0:
            remainder = a % b
            a, b = b, remainder
        return a

    def lcm(self, a, b):
        return a * b / self.gcd(a, b)

    def reduceRational(self):
        """return the reduced fractional value."""
        theGcd = self.gcd(self.number, self.denom)
        return Rational(self.number / theGcd, self.denom / theGcd)

    def __eq__(self, f):
        f1 = self.reduceRational()
        f2 = f.reduceRational()
        return f1.number == f2.number and f1.denom == f2.denom

if __name__ == "__main__":
    inst1 = MyClass(10)
    inst2 = MyClass(20)

    print inst1 + inst2

    oneHalf = Rational(1, 2)
    twoFifths = Rational(2, 5)
    print oneHalf
    print twoFifths

    print oneHalf + twoFifths

#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-16

import string

__author__ = "zhangzhaoyu"

def isFloat(aStr):
    """True if aStr is a float: digits and at most one decimal point"""
    stripped = aStr.replace(".", "", 1)
    return stripped.isdigit()

def readFloat(prompt):
    """keep reading until a valid float is entered"""
    num_str = raw_input(prompt)
    while not isFloat(num_str):
        print "not a valid float, try again."
        num_str = raw_input(prompt)
    return float(num_str)

def rhyme(flower1 = "Roses", color1 = "red", flower2 = "Violets", color2 = "blue"):
    print flower1, "are", color1
    print flower2, "are", color2
    print "Sugar is sweet"
    print "And so are you"

def weightedGrade(gradeList, weights = (0.3, 0.3, 0.4)):
    """Expects 3 elements in gradeList. Multiples each grade by its wieght. Return the sum."""
    result = (gradeList[0] * weights[0]) + (gradeList[1] * weights[1]) + (gradeList[2] * weights[2])
    return result

def grade(fileLine):
    """Expects a line of form last, first, exam1, exam2, exam3"""
    fieldLst = fileLine.split(",")
    name = fieldLst[1] + " " + fieldLst[0]
    grades = []
    for element in fieldLst[2:]:
        grades.append(int(element))

    theGrade = weightedGrade(grades)
    return name, theGrade

if __name__ == "__main__":
    pass

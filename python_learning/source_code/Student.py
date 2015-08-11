#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-18

import string

__author__ = "zhangzhaoyu"

class stu(object):
    def __init__(self, first = "", last = "", id = 0):
        self.firstNameStr = first
        self.lastNameStr = last
        self.idInt = id

    def update(self, first = "", last = "", id = 0):
        if first:
            self.firstNameStr = first
        if last:
            self.lastNameStr = last
        if id:
            self.idInt = id

    def __str__(self):
        return "%s %s, ID: %s" %(self.firstNameStr, self.lastNameStr, self.idInt)

class Student(object):
    """simple student class."""
    def __init__(self, first = "", last = "", id = 0):
        self.firstName = first
        self.lastNameStr = last
        self.idInt = id

    def __str__(self):
        return "%s %s, ID: %s" %(self.firstName, self.lastNameStr, self.idInt)

class myClass(object):
    def method1(self, theTuple):
        self.localList = []
        for element in theTuple:
            if element > 10:
                self.localList.append(element)

    def method2(self):
        self.theSum = 0
        for element in self.localList:
            self.theSum += element
        return self.theSum

if __name__ == "__main__":
    student = Student("zhang", "zhaoyu", 1000)
    print student

    myInstance = myClass()
    myInstance.method1(tuple([1, 2, 10, 13, 15]))
    print myInstance.method2()

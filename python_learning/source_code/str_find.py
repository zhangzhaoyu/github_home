#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-05-09
import string

def find(character, target):
    for index in range(len(target)):
        if target[index] == character:
            print "letter find %d" %(index)
            break
    else:
        print "letter %s not find in %s." %(character, target)

def huiwen():
    originalStr = raw_input("input a string")
    modifiedStr = originalStr.lower()

    badChars = string.whitespace + string.punctuation
    for char in modifiedStr:
        if char in badChars:
            modifiedStr = modifiedStr.replace(char, "")

    if modifiedStr == modifiedStr[::-1]:
        pass

if __name__ == "__main__":
    find("a", "zhangzhaoyu")

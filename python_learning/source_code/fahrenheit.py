#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-10

import string

__author__ = "zhangzhaoyu@anicloud.com"

def f(celsius_float):
    """ convert celsius to fahrenheit"""
    return celsius_float * 1.8 + 32

def length(s):
    """ return the length of s"""
    count = 0
    for ch in s:
        count += 1
    return count

def letterCount(s):
    """return the count of letters in s"""
    count = 0
    for ch in s:
        if ch.lower() in string.lowercase:
            count += 1
    return count

def cleanWord(word):
    """return word in lower case stripped of whitespace."""
    return word.lower().strip()

def readData(filePath = "../data/langwen3800word.txt"):
    fileData = open(filePath, "r")
    for word in fileData:
        word = cleanWord(word)
        if len(word) <= 6:
            continue
        print word

def getVowelsInWord(word):
    """return vowels in string world"""
    vowelStr = "aoeiu"
    vowelsInWord = ""
    for char in word:
        if char = in vowelStr:
            vowelsInWord += char
    return vowelsInWord

if __name__ == "__main__":
    readData()

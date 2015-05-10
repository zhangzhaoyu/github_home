#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-10

import string
from collections import defaultdict

__author__ = "zhangzhaoyu"

def makeWordList(filePath = "../data/gettysburg.txt"):
    gFile = open(filePath, "r")
    speech = []

    for lineStr in gFile:
        lineList = lineStr.split()
        for word in lineList:
            if word != "--":
                speech.append(word.strip(",.").lower())
    return speech

def makeUnique(speech):
    """create a list of unique words."""
    unique = []
    for word in speech:
        if word not in unique:
            unique.append(word)
    return unique

def countTimesOfWords(speech):
    wordDict = defaultdict(int)
    for word in speech:
        wordDict[word] += 1
    return wordDict

if __name__ == "__main__":
    result =  makeWordList()
    print result
    print len(result)

    print "----------"
    unique = makeUnique(result)
    print len(unique)

    wordDict = countTimesOfWords(result)
    print wordDict.items()

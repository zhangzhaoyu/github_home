#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-16

import string
import numpy as np
import pylab

__author__ = "zhangzhaoyu"

def addWord(w, wcDict):
    """update the word frequency: word is the key, frequency is the value."""
    if w in wcDict:
        wcDict[w] += 1
    else:
        wcDict[w] = 1

def processLine(line, wcDict):
    """process the line to get lowercase words to add to the dictionary."""
    line = line.strip()
    wordList = line.split()

    for word in wordList:
        if word != "--":
            word = word.lower().strip()
            word = word.strip(string.punctuation)
            addWord(word, wcDict)

def prettyPrint(wcDict):
    """print nicely from highest to lowest frequency."""
    valKeyList = []
    # valKeyList = [(val, key) fir key, val in wcDict.items()]
    for key, val in wcDict.items():
        valKeyList.append((val, key))
    valKeyList.sort(reverse=True)
    print "%-10s%10s" %("word", "count")
    print "_" * 21
    for val, key in valKeyList:
        print "%-12s  %3d" %(key, val)

def barGraph(wcDict):
    """bar graph"""
    wordList = []
    for key, val in wcDict.items():
        if val > 2 and len(key) > 3:
            wordList.append((key, val))
    wordList.sort()
    keyList = [key for key, val in wordList]
    valList = [val for key, val in wordList]

    barWidth = 0.5
    xVals = np.arange(len(keyList))
    pylab.xticks(xVals + barWidth/2.0, keyList, rotation = 45)
    pylab.bar(xVals, valList, width = barWidth, color = "r")
    pylab.show()

def openFile():
    isOpen = False
    while not isOpen:
        fileName = raw_input("open what file:")
        try:
            inFile = open(fileName, "rU")
            isOpen = True
        except: IOError:
            print "file opening failed, try again."
            
def main():
    wcDict = {}
    fObj = open("../data/gettysburg.txt", "r")
    for line in fObj:
        processLine(line, wcDict)
    print "Length of the dictionary :", len(wcDict)
    prettyPrint(wcDict)
    barGraph(wcDict)

if __name__ == "__main__":
    main()

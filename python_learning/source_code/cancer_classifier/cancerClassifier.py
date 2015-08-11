#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-17

import string

__author__ = "zhangzhaoyu"

def sumLists(list1, list2):
    """sums of two lists of 9 items"""
    listOfSums = [0.0] * 9
    for index in range(9):
        listOfSums[index] = list1[index] + list2[index]
    return listOfSums

def makeDataSet(trainFile):
    tSet = []
    trainingFile = open(trainFile, "rU")
    for line in trainingFile:
        line = line.split()
        id, a1, a2, a3, a4, a5, a6, a7, a8, a9, flag = line.split(",")
        if flag == "4":
            diagMorB = "m" # bad
        else:
            diagMorB = "b" # ok

        patientTuple = (id, diagMorB, int(a1), int(a2), int(a3), int(a4), int(a5), int(a6), int(a7), int(a8), int(a9))
        tSet.append(patientTuple)
    return tSet

def makeTrainingSet(trainingFile):
    return makeDataSet(trainingFile)

def trainClassifier(trainSet):
    return []

def makeTestSet(testFile):
    return makeDataSet(testFile)

def classifyTestRecords(testSet, classifier):
    return []

def reportAccuracy(results):
    return []

def main():
    print "reading in training data..."
    trainingFile = "breast-cancer-training.data"
    trainingSet = makeTrainingSet(trainingFile)
    print "done reading training data."

    print "training classifier..."
    classifier = trainClassifier(trainingSet)
    print "done training classifier."

    print "reading in test data..."
    testFile = "breast-cancer-test.data"
    testSet = makeTestSet(testFile)
    print "done reading test data."

    print "classifying records..."
    resultList = classifyTestRecords(testSet, classifier)
    print "done classifying."

    reportAccuracy(resultList)
    print "program finished."

if __name__ == "__main__":
    main()

#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-05-14

# The implementation of K-Means Clustering Algorithm

import numpy as np
import matplotlib.pyplot as plt
import math as math
import pylab as pylab
from scipy.fftpack import fft, ifft

def loadData(fileName):
    dataMat = []
    fr = open(fileName, "r")
    for line in fr.readlines():
        curLine = line.strip().split("\t")
        fltLine = map(float, curLine)
        dataMat.append(fltLine)
    return dataMat

def distEclud(vecA, vecB):
    return np.sqrt(np.sum(np.power(vecA - vecB, 2)))

def randCenter(dataSet, k):
    """random generate k centers"""
    n = np.shape(dataSet)[1]
    centroids = np.mat(np.zeros((k, n)))
    for j in xrange(n):
        minJ = np.min(dataSet[:, j])
        rangeJ = float(np.max(dataSet[:, j] - minJ))
        centroids[:, j] = minJ + rangeJ * np.random.rand(k, 1)
    return centroids

def kMeans(dataSet, k, distMeas = distEclud, createCent = randCenter):
    # m is the size of dataSet
    m = np.shape(dataSet)[0]
    clusterAssment = np.mat(np.zeros((m, 2)))
    centroids = createCent(dataSet, k)
    clusterChanged = True

    while clusterChanged:
        clusterChanged = False
        for i in xrange(m):
            minDist = np.inf
            minIndex = -1
            # the nearest center
            for j in xrange(k):
                distJI = distMeas(centroids[j,:], dataSet[i,:])
                if distJI < minDist:
                    minDist = distJI; minIndex = j
            # convergent
            if clusterAssment[i,0] != minIndex:
                clusterChanged = True
            clusterAssment[i,:] = minIndex, minDist ** 2
        print clusterAssment
        print centroids
        for cent in xrange(k):
            # get the index of cent center point
            ptsInClust = dataSet[np.nonzero(clusterAssment[:,0].A == cent)[0]]
            # 0 : column mean 1: row mean
            centroids[cent,:] = np.mean(ptsInClust, axis = 0)
    return centroids, clusterAssment

if __name__ == "__main__":
    pass

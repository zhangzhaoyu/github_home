#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

# This module give the method to caculate the distance of two dataset
# based on Discrete Time Fourier Transforms.

import numpy as np
import matplotlib.pyplot as plt
import math as math
import pylab as pylab
from scipy.fftpack import fft, ifft

def calculateDistanceBasedOnDTFT(dataOne, dataTwo):
    fDataOne = fft(dataOne)
    fDataTwo = fft(dataTwo)

    distanceSquare = (fDataOne - fDataTwo) ** 2
    distanceSum = distanceSquare.sum()
    distance = distanceSum ** 0.5
    return distance

def createData(length):
    oneData = []
    twoData = []
    num = 0.0
    while num < math.pi * length:
        oneData.append(math.sin(num))
        twoData.append(math.cos(num))
        num += 0.2
    return np.array(oneData), np.array(twoData)

def drawGraph(one, two = None):
    pylab.plot(one)
    pylab.plot(two)
    pylab.show()

if __name__ == "__main__":
    a = np.array([1, 2, 3])
    b = np.array([2, 3, 4])
    one, two = createData(4)

    result = calculateDistanceBasedOnDTFT(one, two)
    print result

    drawGraph(one, two)

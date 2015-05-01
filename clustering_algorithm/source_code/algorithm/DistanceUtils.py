#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

# This module give the method to caculate the distance of two dataset
# based on Discrete Time Fourier Transforms.

import numpy as np
import matplotlib.pyplot as plt
from scipy.fftpack import fft, ifft

def calculateDistanceBasedOnDTFT(dataOne, dataTwo):
    fDataOne = fft(dataOne)
    fDataTwo = fft(dataTwo)

    distanceSquare = (fDataOne - fDataTwo) ** 2
    distanceSum = distanceSquare.sum()
    distance = distanceSum ** 0.5
    return distance

if __name__ == "__main__":
    a = np.array([1, 2, 3])
    b = np.array([2, 3, 4])

    result = calculateDistanceBasedOnDTFT(a, b)
    print result

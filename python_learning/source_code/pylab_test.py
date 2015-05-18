#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

import string
import numpy as np
import pylab

__author__ = "zhangzhaoyu"

xVals = np.arange(0, 4 * np.pi, 0.1)
y1Vals = np.sin(xVals)
y2Vals = np.cos(xVals)

pylab.title("sine and cosin plot")
pylab.plot(xVals, y1Vals, "b")
pylab.plot(xVals, y2Vals, "r")
pylab.show()

if __name__ == "__main__":
    pass

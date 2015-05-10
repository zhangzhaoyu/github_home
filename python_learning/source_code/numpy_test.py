#! /usr/bin/env python

#author zhangzhaoyu@163.com
#Date   2015-04-15

import numpy as np
import scipy as sp
import pylab as pl

def triangleFunc(c, c0, hc):
    def trifunc(x):
        x = x - int(x)
        if x >= c:
            r = 0.0
        elif x < c0:
            r = x /c0 * hc
        else:
            r = (c - x) / (c - c0) * hc
    return np.frompyfunc(trifunc, 1, 1)

if __name__ == "__main__":
    b = [i for i in range(10)]
    a = np.array(b)
    print a
    print b
    print("hello world!!!")

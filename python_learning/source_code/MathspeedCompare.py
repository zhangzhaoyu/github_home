#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-05-08

import time
import math
import numpy as np

x = [i * 0.001 for i in xrange(1000000)]
start = time.clock()
for i, t in enumerate(x):
    x[i] = math.sin(t)

print "math.sin", time.clock() - start

x = [i * 0.001 for i in xrange(1000000)]
x = np.array(x)
start = time.clock()
np.sin(x, x)
print "np.sin", time.clock() - start


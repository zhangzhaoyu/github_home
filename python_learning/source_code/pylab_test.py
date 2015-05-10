#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

import math
import pylab

y_values = []
x_values = []
num = 0.0

while num < math.pi * 4:
    y_values.append(math.sin(num))
    x_values.append(num)
    num += 0.1

pylab.plot(x_values, y_values, "ro")
pylab.show()

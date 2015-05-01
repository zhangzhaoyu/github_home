#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

import matplotlib.pyplot as plt
import numpy as np
from scipy.fftpack import fft, ifft

#x = np.array([1.0, 2.0, 1.0, -1.0, 1.5])
x = np.array([0.0, 1.0, 0.0, -1.0])
y = fft(x)

print y

yinv = ifft(x)
print yinv


#N = 600
#T = 1.0 / 800.0
#x = np.linspace(0.0, N * T, N)
#y = np.sin(50.0 * 2.0 * np.pi * x) + 0.5 * np.sin(80.0 * 2.0 * np.pi * x)
#yf = fft(y)
#xf = np.linspace(0.0, 1.0/(2.0*T), N/2)




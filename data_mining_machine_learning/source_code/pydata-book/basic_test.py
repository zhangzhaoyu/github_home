#! /usr/bin/env python

# Author:  zhangzhaoyu@anicloud.com
# Date  :  2015-05-08

import numpy as np
import pandas as pd
import matplotlib.pylot as plt
from collections import defaultdict

# get counts
def getCounts(sequence):
    counts = defaultdict(int)
    for x in sequence:
        counts[x] += 1
    return counts

# get top count
def topCounts(count_dict, n = 10):
    value_key_pairs = [(count, tz) for tz, count in count_dict.items]
    value_key_pairs.sort()
    return value_key_pairs[-n:]

if __name__ == "__main__":
    pass

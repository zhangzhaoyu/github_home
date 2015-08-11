#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-19

import string

__author__ = "zhangzhaoyu"

class Island(object):
    def __init__(self, n):
        self.gradSize = n
        self.grid = []
        for i in range(n):
            row = [0] * n
            self.grid.append(row)

    def __str__(self):
        s = ""
        for j in range(self.gradSize - 1, -1, -1):
            for i in range(self.gradSize):
                flag = not self.grid[i][j]
                if not self.grid[i][j]:
                    s += "%-2s" % "." + " "
                else:
                    s += "%-2s" % str((self.grid[i][j]))
            s += "\n"
        return s


if __name__ == "__main__":
    royale = Island(10)
    print royale

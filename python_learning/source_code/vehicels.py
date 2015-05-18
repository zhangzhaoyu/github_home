#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-14

import string

__author__ = "zhangzhaoyu"

def createMileageList(epaFile):
    """create a list of cars and mileage from epaFile"""
    mileageList = []
    for line in epaFile:
        if line[0:5] == "CLASS":
            continue
        lineList = line.split(",")
        mileageList.append(int(lineList[9]))
    return mileageList

if __name__ == "__main__":
    pass

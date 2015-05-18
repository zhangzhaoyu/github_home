#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-16

import string
import csv

__author__ = "zhangzhaoyu"

def readTable(fileObj):
    """read periodic table file into a dict. with element symbol as key."""
    dataFile = csv.reader(fileObj)
    periodicTable  = {}

    for row in dataFile:
        if row[0].isdigit():
            symbol = row[1]
            periodicTable[symbol] = row[:8]
    return periodicTable

def parseElement(elementStr):
    """parse element string into symbol and quantity"""
    symbol = ""
    quantity = ""
    for ch in elementStr:
        if ch.isalpha():
            symbol = symbol + ch
        else:
            quantity += ch
    if quantity == "":
        quantity = 1
    return symbol, int(quantity)


if __name__ == "__main__":
    pass

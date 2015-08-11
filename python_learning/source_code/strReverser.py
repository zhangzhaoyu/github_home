#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-20

import string

__author__ = "zhangzhaoyu"

def reverse(aStr):
    """reverse a string"""
    if len(aStr) == 0:
        return aStr
    newStr = reverse(aStr[1:]) + aStr[0]
    return newStr

if __name__ == "__main__":
    nameStr = "zhangzhaoyu"
    print reverse(nameStr)

    print nameStr[::-1]

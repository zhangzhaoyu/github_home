#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-17

import string
import os

__author__ = "zhangzhaoyu"

def check(searchStr, count, fileList, dirList):
    for dirName, dirs, files in os.walk("."):
        for f in files:
            if os.path.splitext(f)[1] in [".txt", ".py"]:
                count = count + 1
                aFile = open(os.path.join(dirName, f), "rU")
                fileStr = aFile.read()
                if searchStr in fileStr:
                    fileName = os.path.join(dirName, f)
                    fileList.append(fileName)
                    if dirName not in dirList:
                        dirList.append(dirName)
                aFile.close()
    return count

if __name__ == "__main__":
    

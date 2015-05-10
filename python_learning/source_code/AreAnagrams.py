#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-10

import string

__author__ = "zhangzhaoyu"

def areAnagrams(word1, word2):
    """return truem if words are anagrams."""
    word1Sorted = sorted(word1)
    word2Sorted = sorted(word2)

    #return True if word1Sorted == word2Sorted else False
    return word1Sorted == word2Sorted

if __name__ == "__main__":
    result = areAnagrams("zhang", "gzhan")
    print result

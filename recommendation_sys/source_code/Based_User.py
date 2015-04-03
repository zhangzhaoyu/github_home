#! /usr/bin/env python

import random as random

def splitData(data, M, K, seed) :
    test = []
    train = []
    random.seed(seed)

    for user, item in data :
        if random.randint(0, M) == K :
            test.append([user, item])
        else :
            train,append([user, item])
        return train, test

def GetRecommendation(user, N) :
    print "in building"


def reCall(train, test, N) :
    hit = 0
    all = 0
    for user in train.keys() :
        tu = test[user]
        rank = GetRecommendation(user, N)
        for item, pui in rank :
            if item in tu :
                hit += 1
        all += len(tu)
    return hit / (all * 1.0)

def precision(train, test, N) :
    hit = 0
    all = 0
    for user in train.keys() :
        tu = test[user]
        rank = GetRecommendation(user, N)
        for item, pui in rank :
            if item in tu :
                hit += 1
        all += N
    return hit / (all * 1.0)

def coverage(train, test, N) :
    recommend_items = set()
    all_items = set()
    for user in train.keys() :
        for item in train[user].keys() :
            all_items.add(item)
        rank = GetRecommendation(user, N)
        for item, pui in rank :
            recommend_items.add(item)
    return len(recommend_items) / (len(all_items) * 1.0)

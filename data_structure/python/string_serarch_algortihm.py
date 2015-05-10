#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

def bruteForce(src, des):
    lengthSrc = len(src)
    lengthDes = len(des)

    for i in range(lengthSrc - lengthDes):
        k = i
        for j in range(lengthDes):
            if src[k] != des[j]:
                break
            else:
                k += 1
            if (j + 1) == lengthDes:
                return i
    return -1

def findAll(src, des):
    result = []
    lengthSrc = len(src)
    lengthDes = len(des)

    #for i in range(lengthSrc - lengthDes):
    i = 0
    while lengthSrc - i > lengthDes:
        tempSrc = src[i:]
        position = bruteForce(tempSrc, des)
        if position != -1:
            result.append(position + i)
            i = i + position + 1
        else:
            break
    return result

if __name__ == "__main__":
    src = "zhangzhaoyuzhazhazhaoyuzhang"
    des = "zh"
    result = findAll(src, des)
    for i in result:
        print src[i:i+2]

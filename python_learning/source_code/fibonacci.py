#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

def fib(n):
    a, b = 0, 1
    while a < n:
        print a
        a, b = b, a + b

def fib2(n):
    result = []
    a, b = 0, 1
    while a < n:
        result.append(a)
        a, b = b, a + b
    return result


if __name__ == "__main__":
    fib(1000)
    print  fib2(10)


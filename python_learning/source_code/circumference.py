#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

import math

radiusString = raw_input("Enter the radius of your circle: ")
radiusInteger = int(radiusString)

circuference = 2 * math.pi * radiusInteger
area = math.pi * (radiusInteger ** 2)

print "The circumference is :" , circuference, ", and the area is " , area

print "The circumference is : %f , and the area is  %f" %(circuference, area)

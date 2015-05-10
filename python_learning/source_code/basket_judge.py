#! /usr/bin/env python

# author zhangzhaoyu@anicloud.com
# Date   2015-04-28

pointStr = raw_input("enter the lead in points :")
points = int(pointStr)

points = points - 3

has_ball = raw_input("Does the lead team have the ball (Yes or No):")
if has_ball == "Yes":
    points += 0.5
else:
    points -= 0.5

if points < 0:
    points = 0

points = points ** 2

seconds = int(raw_input("enter the number of seconds remaining:"))
if points > seconds:
    print "Lead is safe"
else:
    print "Not Safe"

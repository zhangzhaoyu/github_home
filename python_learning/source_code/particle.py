#! /usr/bin/env python
# -*- coding: utf-8 -*-

# author zhangzhaoyu@anicloud.com
# Date   2015-05-19

import string

__author__ = "zhangzhaoyu"

class Particle(object):
    def __init__(self, name = "", position = (0.0, 0.0, 0.0), velocity = (0.0, 0.0, 0.0), spin = 0.0):
        self.name = name
        self.postion = position
        self.velocity = velocity
        self.spin = spin

    def __str__(self):
        pass

class MassParticle(Particle):
    def __int__(self, name = "", position = (0.0, 0.0, 0.0), velocity = (0.0, 0.0, 0.0), spin = 0.0, mass = 0.0):
        Particle.__init__(self, name, position, velocity, spin)
        self.mass = mass

    def __str__(self):
        tempStr = Particle.__str__(self)
        pass

class ChargedParticle(MassParticle):
    def __init__(self):
        pass

    def __str__(self):
        pass

if __name__ == "__main__":
    pass

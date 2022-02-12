# -*- coding: utf-8 -*-

import ctypes
import os
import sys

dirname, _ = os.path.split(os.path.abspath(__file__))
lib = ctypes.cdll.LoadLibrary(dirname + "/libadd_c.so")

lib.create.argtypes = []
lib.create.restype = ctypes.c_void_p

lib.destory.argtypes = [ctypes.c_void_p]
lib.destory.restype = None

lib.add.argtypes = [ctypes.c_int, ctypes.c_int]
lib.add.restype = ctypes.c_int

class Add:
    def __init__(self):
        self.obj = lib.create()

    def __del__(self):
        lib.destory(self.obj)

    def add(self, left, right):
        return lib.add(self.obj, left, right)

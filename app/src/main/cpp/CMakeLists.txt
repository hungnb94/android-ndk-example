cmake_minimum_required(VERSION 3.18.1)

add_library(
        # Set the name of the library
        fibonacci-lib
        # Designate the library as a shared library (.so)
        SHARED
        jni-facade.cpp
        fibo.cpp
)
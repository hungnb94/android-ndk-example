package com.hb.ndkexample.ndk

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NdkManager {
    suspend fun computeFibonacci(argument: Int): Long {
        return withContext(Dispatchers.Default) {
            computeFibonacciNative(argument)
        }
    }

    private external fun computeFibonacciNative(argument: Int): Long

    private companion object {
        init {
            System.loadLibrary("fibonacci-lib")
        }
    }
}
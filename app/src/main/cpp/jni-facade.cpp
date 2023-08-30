#include <jni.h>
#include "fibo.h"

JNIEXPORT extern "C" jlong JNICALL
Java_com_hb_ndkexample_ndk_NdkManager_computeFibonacciNative(
        JNIEnv *env,
        jobject thiz,
        jint n
) {
    jlong result = static_cast<jlong>(computeFibonacci(n));
    return result;
}
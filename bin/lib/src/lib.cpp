#include <vector>
#include "JNISortingUtils.h"
#include "stdint.h"
#include <algorithm>  

using intarray = std::vector<int>;

JNIEXPORT jintArray JNICALL Java_com_example_jnisort_model_JNISortingUtils_sortArrayNumber
  (JNIEnv *Env, jobject Obj, jintArray Array)
{
    uint32_t size = Env->GetArrayLength(Array);

    intarray sorted(size);

    Env->GetIntArrayRegion(Array, 0, size, reinterpret_cast<jint*>(sorted.data()));

    sort(sorted.begin(), sorted.end());

    jintArray result = Env->NewIntArray(size);

    Env->SetIntArrayRegion(result, 0, size, reinterpret_cast<jint*>(sorted.data()));

    return result;
}

JNIEXPORT void JNICALL Java_com_example_jnisort_model_JNISortingUtils_print
  (JNIEnv *Env, jobject Obj)
{
  printf("Hello this is JNI lib \n");
}
#include <string>
#include "JniDemo.h"
#include "str_print.h"

JNIEXPORT void JNICALL Java_JniDemo_print (JNIEnv *env, jobject obj, jstring text)
{
    char* str=(char*)env->GetStringUTFChars(text,JNI_FALSE);
    std::string tmp = str;
    StrPrint ins;
    ins.print(tmp);
}

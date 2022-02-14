#include "str_print.h"

extern "C" {
void str_print(const char* text) {
    StrPrint cpp_ins;
    std::string str = text;
    cpp_ins.print(str);
}
}

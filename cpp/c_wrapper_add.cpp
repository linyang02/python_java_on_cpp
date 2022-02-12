#include <cstdlib>
#include "add.h"
using namespace std;
extern "C" {
Add* create() {
    return new Add();
}

void destory(Add* obj) {
    if (obj) {
        delete obj;
        obj = NULL;
    }
}

int add(Add* obj, int a, int b) {
    return obj->add(a, b);
}
}

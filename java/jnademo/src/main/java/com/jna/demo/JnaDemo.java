package com.jna.demo;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class JnaDemo {

    public interface CLibrary extends Library {

        CLibrary INSTANCE = (CLibrary)Native.loadLibrary("str_print", CLibrary.class);

        void str_print(String text);
    }

    public void str_print(String text)
    {
        CLibrary.INSTANCE.str_print(text);
    }
}

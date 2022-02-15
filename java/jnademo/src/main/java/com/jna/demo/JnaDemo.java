package com.jna.demo;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class JnaDemo {
    private CLibrary cLibrary;

    public interface CLibrary extends Library {
        void str_print(String text);
    }

    public JnaDemo() {
        cLibrary = Native.load("str_print", CLibrary.class);
    }

    public void str_print(String text)
    {
        cLibrary.str_print(text);
    }
}

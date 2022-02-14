import java.lang.String;
public class JniDemo {
    public native void print(String text);
    public static void main(String[] args){
        System.loadLibrary("JniDemo");
        new JniDemo().print("Hello Jni.");
    }
}

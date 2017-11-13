import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    
    private Singleton(){}
    
    public static String str;
    private static Singleton instance = new Singleton();
    static Singleton getSingleInstance() {
        return instance; 
    }

}

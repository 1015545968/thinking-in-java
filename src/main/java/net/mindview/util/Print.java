package net.mindview.util;

import java.io.PrintStream;

/**
 * Created by jinsheng on 14-3-30.
 * Print methods that can be used without qualifiers, using Java SE5 static imports
 */
public class Print {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void print() {
        System.out.println();
    }

    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    public static PrintStream printf(String format, Object...args) {
        return System.out.printf(format, args);
    }
}
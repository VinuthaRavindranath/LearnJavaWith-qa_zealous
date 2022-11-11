package LangPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class ReflectionDemo {
    public int a;
    private int b;
    int c;
    protected int d;

    public ReflectionDemo() {

    }

    public ReflectionDemo(int x, int y) {

    }

    public void display(String s1, String s2) {

    }

    public int show(int x, int y) {
        return 0;
    }
}

public class Lesson9 {
    public static void main(String[] args) {
        Class c = ReflectionDemo.class;
        // or as below
        // ReflectionDemo r = new ReflectionDemo();
        // Class c1 =r.getClass()

        Field feild[] = c.getDeclaredFields();

        System.out.println(c.getName());
        for (Field f : feild) {
            System.out.println(f);
        }
        Constructor con[] = c.getConstructors();
        for (Constructor constr : con) {
            System.out.println(constr);
        }

        Method meth[] = c.getMethods();
        for (Method m : meth) {
            System.out.println(m);
            Parameter param[] = meth[0].getParameters();
        }
    }
}

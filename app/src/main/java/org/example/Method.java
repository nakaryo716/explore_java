package org.example;

import java.util.function.Function;

public class Method {
    public static void method() {
       var svc = new Method(); 
       var result = svc.add(3, 10);
       System.out.println(result);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void func() {
        Function<String, String> func = txt -> txt.concat("!");

        var result = func.apply("Hello World");
        System.out.println(result);
    }

    public void funcCallInner() {
        var result = this.funcs.apply("HI");
        System.out.println(result);
    }

    private Function<String, String> funcs = x -> x.concat("!");
}

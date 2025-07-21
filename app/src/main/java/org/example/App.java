package org.example;

public class App {
    public static void main(String[] args) {
        Method.func();

        var svc = new Method();
        svc.funcCallInner();
    }
}

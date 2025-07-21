package org.example;

public class Variables {
    public static void mut() {
        // declare and copy
        var number = 10;
        var number2 = number;

        // mutable
        number = 20;

        // print both
        // will print 20 
        System.out.println(number);
        // will print 10
        System.out.println(number2);
    }

    public static void constant() {
        // declare as final value
        final var number = 10;

        // compile error
        // final is like immutable, const in rust lang
        // number = 20;
        
        // will print 10
        System.out.println(number);
    }

    public static void types() {
        // type inference
        var inferenceNumber = 10;
        System.out.println(inferenceNumber);

        // i8 in rust
        byte byteNumber = 127;
        System.out.println(byteNumber);

        // i16 in rust
        short shortNumber = 32767;
        System.out.println(shortNumber);

        // i32 in rust
        int number = 10;
        System.out.println(number);

        // i64 in rust
        Long longNumber = 10L;
        System.out.println(longNumber);

        // f32 in rust
        float floatNumber = 32.0F;
        System.out.println(floatNumber);

        // f64 in rust
        double dobuleNumber = 64.0F;
        System.out.println(dobuleNumber);

        // bool in rust
        boolean isOk = true; 
        boolean isErr = false; 
        System.out.println(isOk);
        System.out.println(isErr);

        // char in rust
        char character = 'A';
        System.out.println(character);

        // String in rust
        String text = "Hello";
        String emoji = "🐱";
        System.out.println(text);
        System.out.println(emoji);
    }

    public static void array() {
        // declare array 
        // We can use other way like this
        // String[] arr = new String[3];
        String[] arr = {"Hello", "World", "!"};
        // type inference can also use
        var arr2 = arr;

        // print elements by using old way(stream...) 
        // will "Hello\nWorld\n!\n"
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } 

        // change elements
        arr2[0] = "Good Bye";
        arr[2] = "LoL";

        // will "Good Bye\nWorld\nLoL\n"
        // because array type is reference
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } 

        // will occur exception of out of index
        try {
            // unreachable!
            System.out.println(arr2[128]);
        } catch (Exception e) {
            System.out.println("Failed to read value");
        }
    }
}

package org.example;

public class Flow {
   public static void ifStateMent() {
       var text = "Hello"; 
       var otherText = new String(text);

       if (text.equals(otherText)) {
           System.out.println("text is same");
       } else {
           System.out.println("text is wrong");
       }

       var age = 17;
       if (age >= 18) {
            System.out.println("Adult");
       } else if (age > 15 && age < 20) {
            System.out.println("Boy & Girl");
       } else {
           System.out.println("Kids");
       }
   } 

   public static void ifExpression() {
       var number = 128;
       var text = number > 64 ? "OK" : "ERR";
       System.out.println(text);
   }

   public static void forLoop() {
       String[] arr = {"Hi", "java", "developer", "!"};

       for (var i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }

       for (var element : arr) {
           System.out.println(element);
       }
   } 
}

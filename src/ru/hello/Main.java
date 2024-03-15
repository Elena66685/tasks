package ru.hello;

class Rectangle {
    int i;
    int v;
    Rectangle (int c, int n) {
        i = c;
        v = n;
    }

   void d () {
       if (i != v) {
         for (int r = 0; r < i; r++) System.out.print("*");
         for (int c = 2; c < v; c++)
         {
             System.out.println();
             System.out.print("*\t*");
         }
         System.out.println();
         for (int r = 0; r < i; r++) System.out.print("*");
       }
       else System.out.println("Это квадрат!");
    }



}

public class Main {
    public static void main(String[] args) {
        Rectangle m = new Rectangle(5, 7);
        m.d();
    }
}
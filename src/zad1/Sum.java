package zad1;

public class Sum {
    public static void main(String[] args) {
     int[] s = {1, 3, 3, 7, 5, 1, 7, 1, 1, 3};
     int count = 0;
     for (int i = 0; i < 10; i++)
     {
         if (i == 9 && s[i] % 2 != 0)
         {
             count -= s[0];
             break;
         }
         if (s[i] % 2 != 0)
         {
             count += s[i];
         }
         else break;
     }
        System.out.println("Cумма = " + count);
    }
}

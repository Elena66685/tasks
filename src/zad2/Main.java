package zad2;

public class Main {
    public static void main(String[] args) {
        String str = "Изучаем Java!";
        for (int i = 0; i < str.length(); i++)
        {
            if (i == 0) System.out.println(str.charAt(i));
            if (i == str.length() - 1) System.out.println(str.charAt(i));
        }
        System.out.println(str.length());
        int v = str.length() / 2;
        if (str.length() % 2 != 0) System.out.println(str.charAt(v));
    }
}

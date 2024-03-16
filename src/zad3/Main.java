package zad3;

public class Main {
    public static void main(String[] args) {
        String str = "Строка";
        if (str.length() > 5) {
            System.out.println(str.charAt(0) + " " + str.charAt(1) + " " + str.charAt(2));
            System.out.println(str.charAt(str.length() - 1) + " " + str.charAt(str.length() - 2)
                    + " " + str.charAt(str.length() - 3));
        }
        else
            for (int i = 0; i < str.length(); i++)
            {
                System.out.println(str.charAt(0));
            };
        }
    }


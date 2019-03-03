import java.util.Scanner;
public class Zadanie_7 {
    public static void main(String[] args) {
        System.out.println("Введите число переменной Т");
        Scanner t = new Scanner(System.in);
        int T = t.nextInt();
        int X = 6, Y = 7, Z = 15;
        if (T== X||T==Y||T==Z){
           System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println ("Такой константы нет!");

        }


    }
}

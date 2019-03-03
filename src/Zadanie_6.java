import java.util.Scanner;
public class Zadanie_6 {
    public static void main(String[] args) {
        System.out.println("Вести три целых числа с клавиатуры x, y, z");
        Scanner x = new Scanner(System.in);
        int X = x.nextInt();
        Scanner y = new Scanner(System.in);
        int Y = y.nextInt();
        Scanner z = new Scanner(System.in);
        int Z = z.nextInt();

        double m = (X+Y+Z)/3.0;
        System.out.println("Среднее арефметическое: " + m);

        int w= (int) (m/2);

        if(w>3){
            System.out.println("Программа выполнена корректно");

        }





    }
}

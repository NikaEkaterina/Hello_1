import java.util.Scanner;
public class Zadanie_14 {
    public static void main(String[] args) {
        System.out.println("введите число:");
        Scanner S = new Scanner(System.in);
        String s = S.nextLine();
        int x =  Integer.parseInt(s);
        double y = (double) x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);


    }
}

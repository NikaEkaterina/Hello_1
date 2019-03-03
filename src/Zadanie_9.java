import java.util.Scanner;
public class Zadanie_9 {
    public static void main(String[] args) {
        int mas [] = new int [10];
        for(int i=0; i<10;i++){
            Scanner t = new Scanner(System.in);
            mas [i]=t.nextInt();
        }
        for (int i=0; i<10; i++){
            System.out.print(mas [i]*2 + " ");
        }
    }
}

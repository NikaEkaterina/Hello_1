import java.util.Scanner;
public class Zadanie_9 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int mas [] = new int [N];
        System.out.println("Введите элементы массива");
        for(int i=0; i<N;i++){
            Scanner t = new Scanner(System.in);
            mas [i]=t.nextInt();
        }
        for (int i=0; i<N; i++){
            System.out.print(mas [i]*2 + " ");
        }
    }
}

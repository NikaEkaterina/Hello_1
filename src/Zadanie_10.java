import java.util.Scanner;
public class Zadanie_10 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        Scanner ni = new Scanner(System.in);
        Scanner nj = new Scanner(System.in);
        int nI = ni.nextInt();
        int nJ = nj.nextInt();
        int mas [] [] = new int [nI] [nJ];
        System.out.println("Введите элементы матрицы");
        for (int j=0; j<nJ; j++){
            for(int i=0; i<nI;i++){
                Scanner t = new Scanner(System.in);
                mas [i] [j]=t.nextInt();
            }
        }
        for (int i=0; i<nI; i++){
            System.out.print(mas [i] [0]*3 + " ");
        }
    }
}

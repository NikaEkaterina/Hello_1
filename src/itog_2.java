
import java.util.Scanner;
public class itog_2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int [] a = new int[n];
        System.out.println(" Введите значения каждого элемента массива: ");
        for (int i = 0; i<n; i++){
            a[i] = S.nextInt();
        }
        System.out.println("Результат сортировки:");
        for (int j = 0; j<n-1; j++) {
            for (int i = 0; i<n-j-1; i++) {
                int max=0;
                if (a[i]>a[i+1]){
                    max=a[i];
                    a[i]=a[i+1];
                    a[i+1]=max;

                }

            }

        }
        for(int i =0; i <n ; i++){
            System.out.print(a[i] + " ");
        }


    }
}

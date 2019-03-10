import java.util.Scanner;

public class Zadanie_13 {
    public static void main(String[] args) {
        System.out.println("Ввести любое две строки:");
        Scanner str1 = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        String st1 = str1.nextLine();
        String st2 = str2.nextLine();
        char [] chArray1= st1.toCharArray();
        char [] chArray2= st2.toCharArray();
        int size1 = chArray1.length;
        int size2 = chArray2.length;
        System.out.println("Строка с максимальным колличеством символов:");
        if (size1>=size2){
            System.out.println(st1);

        }
        else{
            System.out.println(st2);
        }

    }

}

import java.util.Scanner;

public class Zadanie_12 {
    public static void main(String[] args) {
        System.out.println("Ввести любое слово или фразу: ");
        Scanner str = new Scanner(System.in);
        String st = str.nextLine();
        char [] chArray= st.toCharArray();
        for (int i=0;i<chArray.length; i++){
            if(chArray[i] ==' '){

                chArray[i]=0;

            }

        }
        System.out.println(chArray);

    }
}

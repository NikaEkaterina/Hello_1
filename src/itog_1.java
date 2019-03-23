import java.util.Scanner;

public class itog_1 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String sRd = rd.nextLine();


        int number2 =  Integer.parseInt(sRd);

        int number10=0, power=0;
        while (number2>0)
        {

            number10= (int) (number10+Math.pow(2, power)*number2%10);
            number2=number2/10;
            power++;

        }

        System.out.println(number10);

    }
}

import java.util.Scanner;

public class itog_3
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс доллара:");
        double rate=Double.parseDouble(sc.nextLine());
        System.out.println("Введите сумму в рублях");
        double rub=Double.parseDouble(sc.nextLine());

        double usd=rub/rate;

        System.out.println("Сумма в долларах: " + usd);


    }
}
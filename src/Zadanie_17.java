import java.io.*;
public class Zadanie_17 {
    public static void main(String[] args) {
        String Ymka;
        BufferedReader cat = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");
        try (FileWriter fw = new FileWriter("C:\\Users\\pobed\\OneDrive\\Desktop\\may.txt"))
        {
            do {
                System.out.println(": ");
                Ymka = cat.readLine();
                if (Ymka.compareTo("stop") == 0) break;
                Ymka = Ymka + "\r\n";
                fw.write(Ymka);

            }
            while (Ymka.compareTo("stop") != 0);


        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

    }
}

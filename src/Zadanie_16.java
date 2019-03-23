import java.io.*;
public class Zadanie_16 {
    public static void main(String[] args) {
        String a;
        try (BufferedReader nk = new BufferedReader(new FileReader("C:\\Users\\pobed\\OneDrive\\Desktop\\text.txt")))
        {
            while ((a = nk.readLine()) != null) {
                System.out.println(a);
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }

}

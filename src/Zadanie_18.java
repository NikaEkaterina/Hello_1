import java.io.*;
public class Zadanie_18 {
    public static void main(String[] args) {
        int count=0;

        try{

            File myFile =new File("C:\\text.txt");
            FileReader fileReader = new FileReader(myFile);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

            int lineNumber = 0;

            while (lineNumberReader.readLine() != null){
                lineNumber++;
            }

            count=lineNumber;

            lineNumberReader.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        String a;
        try (BufferedReader nk = new BufferedReader(new FileReader("C:\\text.txt")))
        {
            while ((a = nk.readLine()) != null) {

                System.out.println(a);
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        try {
            FileWriter fstream1 = new FileWriter("C:\\text.txt");
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();
        } catch (Exception e)
        {System.err.println("Error in file cleaning: " + e.getMessage());}
        System.out.println("Введите строк в колличестве: " +count);

        int nR=0;
        String Ymka;
        BufferedReader cat = new BufferedReader(new InputStreamReader(System.in));

        try (FileWriter fw = new FileWriter("C:\\text.txt"))
        {
            do {

                Ymka = cat.readLine();


                Ymka = Ymka + "\r\n";

                fw.write(Ymka);
                nR++;


            }
            while (nR<count );


        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }




    }

}


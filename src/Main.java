
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //System.out.println("What is your name?");
        //String text = input.nextLine();
        //System.out.println("Hello " + text);

        try {
            File file = new File("C:\\TestFiles\\testfile.txt");
            Scanner inputFile = null;
            inputFile = new Scanner(file);
            while(inputFile.hasNextLine()){String line = inputFile.nextLine();
                System.out.println(line);

            }
            inputFile.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("Exception: Error File not found in directory !!!");;
        }

    }
}
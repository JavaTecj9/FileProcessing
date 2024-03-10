package FileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReadFile {
    private String fileName;

    public static void scannerReadFile(String fileName) {
        try {
            //Create an instance of File class
            File file = new File(fileName);
            //Create an instance of Scanner class
            Scanner inputFile = new Scanner(file);
            //Loop through file with nextLine()
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                System.out.println(line);

            }
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception: Error File not found in directory !!!");
        }
    }
}

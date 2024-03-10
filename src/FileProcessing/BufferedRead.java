package FileProcessing;

import java.io.*;
import java.util.*;

public class BufferedRead {
    private String fileName;

    public static void bufferRead (String fileName) {

        //Create an instance of BufferedReader that is null so "bufferedReader" variable is global
        BufferedReader bufferedReader = null;
        //Same for FileReader
        FileReader fileReader = null;
        try {
            //Create an instance of File Class
            File file1 = new File(fileName);
            //Instance of FileReader is already create above assign "fileReader" value of
            fileReader = new FileReader(file1);
            //Instance of BufferedReader is already create above assign "bufferedReader" value of
            bufferedReader = new BufferedReader(fileReader);

            //Loop to read file
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            System.out.println(line);
        }
        catch (FileNotFoundException e) {
                System.out.println("Exception: Error File not found in directory !!!");
        } catch (IOException e) {
            System.out.println("Problem reading file " + fileName);;
        }
        //Close bufferedReader
        try {
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test Commit");
    }
}

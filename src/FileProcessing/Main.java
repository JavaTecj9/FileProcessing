package FileProcessing;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ScannerReadFile.scannerReadFile("C:\\TestFiles\\testfile.txt");

        BufferedRead.bufferRead("C:\\TestFiles\\testfile.txt");
    }
}
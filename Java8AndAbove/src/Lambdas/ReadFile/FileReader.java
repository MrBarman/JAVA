/**
 * This is sample basic implementation of Lambdas where we passed the behaviour
 * in the param as lambda expression
 */
package Lambdas.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FileReader {
    public static void main(String[] args) throws IOException {
        String readLineOneLine = processFile(BufferedReader::readLine);
        System.out.println(readLineOneLine);
        String readLineTwoLines = processFile((BufferedReader br)-> br.readLine()+br.readLine());
        System.out.println(readLineTwoLines);
    }

    private static String processFile(FileProcessor p) throws IOException {
        URL path = FileReader.class.getResource("test.txt");
        File f = new File(path.getFile());
        try(BufferedReader br = new BufferedReader(new java.io.FileReader(f))) {
            return p.process(br);
        }
    }
}

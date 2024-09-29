package Lambdas.ReadFile;

import java.io.BufferedReader;
import java.io.IOException;

public interface FileProcessor {
    String process(BufferedReader br) throws IOException;
}

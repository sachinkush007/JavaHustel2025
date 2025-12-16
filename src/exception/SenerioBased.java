package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SenerioBased {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("test.txt");
        }
        catch (IOException e) {
            throw new RuntimeException("Error While reading the file"+e);
        }
    }
}

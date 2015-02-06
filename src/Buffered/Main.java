package Buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String s;
        while ( (s = reader.readLine()) != null) {
            System.out.print(s);
        }
        reader.close();
        
        PrintWriter write = new PrintWriter("test2.txt");
        write.println("wertfwsfdfsdfsdf");
        write.close();
    }
}

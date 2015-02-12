package lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class copyFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("File name?");
        String fileName = sc.nextLine();        
        File f1 = new File(fileName);
        if (f1.exists()) {
            System.out.println("New file name?");
            if( sc.hasNextLine() ){
                BufferedReader reader = new BufferedReader(new FileReader(f1));
                PrintWriter write = new PrintWriter(sc.nextLine());
                String line = null;
                int words = 0,lines = 0 ,chars = 0;
                while ( (line = reader.readLine()) != null ) {
                    lines++;                    
                    String[] ws = line.trim().split("\\s+");
                    words += ws.length;
                    for(String w: ws)
                        chars += w.length();
                    write.println(line.toUpperCase());
                }
                reader.close();
                write.close();
                System.out.printf("Количество строк %d\r\nколичество слов %d\r\nколичество символов %d\r\n",lines,words,chars);
            }            
        } else {
            System.err.println("File doesn't exist!");
        }
    }
}

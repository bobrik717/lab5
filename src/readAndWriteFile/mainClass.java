package readAndWriteFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class mainClass 
{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fs = new FileInputStream("test.txt");
        while ( fs.available() != 0 ) {            
            char ch = (char)fs.read();
            System.out.print(ch);
        }
        fs.close();
        
        FileOutputStream fo = new FileOutputStream("test2.txt");
        String s = "Hello";
        byte[] b = s.getBytes("UTF-8");
        fo.write(b);
        fo.close();
    }
}

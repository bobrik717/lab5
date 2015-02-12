package randomAccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        RandomAccessFile ra = new RandomAccessFile("test.txt", "rw");
        ra.seek(ra.length());
        //String s = ra.readUTF();
        ra.writeUTF("Конец");
        String s = "Конец";
        byte[] sb = s.getBytes();
        ra.write(sb);
        ///System.out.println(s);
        ra.close();
    }
}

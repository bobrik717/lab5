package Serialize;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PersonInfo pi = new PersonInfo("Konstantin",27);
        pi.showInfo();
        File f1 = new File("serializableData.ser");
        if(!f1.exists()){
            f1.createNewFile();
        }
        try (FileOutputStream fs = new FileOutputStream(f1); ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(pi);
        }
        
        FileInputStream fis = new FileInputStream(f1);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("*********************************************");
        
        PersonInfo restoredPersonInfo = (PersonInfo)ois.readObject();
        restoredPersonInfo.showInfo();
    }
}

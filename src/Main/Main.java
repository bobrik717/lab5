package Main;

import java.io.*;
import java.util.Date;
import directoryTree.Tree;

public class Main {
    public static String fileName = "./test.txt";
    public static String dirName = ".";
    public static void main(String[] args) {        
        /*File f1 = new File(fileName);
        if( !f1.exists() ){
            System.out.printf("File %s doesn't exist!",f1.getAbsolutePath());
        }else{
            Date d = new Date(f1.lastModified());
            try{
                System.out.printf("File %s exist! \r\n lenght %d\r\ndate modified %s\r\n",f1.getCanonicalPath(),f1.length(),d.toLocaleString());
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
        File d1 = new File(dirName);
        System.out.println(d1.getAbsolutePath());
        if(d1.isDirectory()){
            File[] files = d1.listFiles();
            for(File f:files){
                if(f.isDirectory()){
                    System.out.println(f.getName().toUpperCase());
                }else{
                    System.out.println(f.getName().toLowerCase());
                }
            }
        }*/
        Tree t = new Tree();
        t.drowTree(dirName);
    }
}

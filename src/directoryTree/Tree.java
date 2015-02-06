package directoryTree;

import java.io.File;
import java.util.Date;

public class Tree {            
    public void drowTree(String dir,int level){
        File f = new File(dir);
        if(f.exists()){
            File[] fileList = f.listFiles();
            for(File file:fileList){
                if(file.isDirectory()){
                    for(int i = 0;i < level;i++){
                        System.out.print("-");                        
                    }                    
                    System.out.printf("Directory name %s\r\n",file.getName().toUpperCase());
                    this.drowTree(file.getPath(), level + 1);
                }
            }
            for(File file:fileList){
                if(file.isFile()){
                    for(int i = 0;i < level;i++){
                        System.out.print("-");                        
                    }                    
                    System.out.printf("File name %s size %d last modified %s \r\n",file.getName().toLowerCase(),file.length(),new Date(file.lastModified()).toLocaleString());
                }
            }
        }else{
            System.out.printf("Dir %s doesn't exist\r\n",dir);
        }
    }
    
    public void drowTree(File f){
       this.drowTree(f.getPath(),0);
    }
    
    public void drowTree(String path){
       this.drowTree(path,0);
    }
}

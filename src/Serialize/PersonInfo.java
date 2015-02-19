package Serialize;

import java.io.*;

public class PersonInfo implements Serializable{
    private String name;
    private int age;
    
    public PersonInfo(){
        System.out.println("Default constractur");
    }
    
    public PersonInfo(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void showInfo(){
        System.out.printf("Name %s \r\n Age %d \r\n",this.name,this.age);
    }
}

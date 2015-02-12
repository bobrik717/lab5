package Enum;

import java.util.Date;

public class Main {
    enum Color{
        Red,Blue,Green;        
        public String translate(){
            if(this.equals(Color.Red)){
                return "Красный";
            }
            if(this.equals(Color.Green)){
                return "Зелёный";
            }
            if(this.equals(Color.Blue)){
                return "Синий";
            }
            return "";
        }
    }
    enum Day{Воскресенье,Понедельник,Вторник,Среда,Четверг,Пятница,Суббота}
    public static void main(String[] args) {
        Color c = Color.Green;
        System.out.println(c.translate());
        Date now = new Date();
        Day d = Day.values()[now.getDay()];
        System.out.println(d);
        String date = "1987/10/13";
        Date birthday = new Date(Date.parse(date));
        birthday.setYear(now.getYear());
        System.out.println(birthday.toLocaleString());
        if(birthday.after(now)){
            System.out.println("NO");
        }
    }
}

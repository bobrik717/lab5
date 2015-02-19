package lab;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class HundredYears {
    enum Day{Воскресенье,Понедельник,Вторник,Среда,Четверг,Пятница,Суббота}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату рождения. Формат 'YYYY/MM/DD'");
        if(sc.hasNextLine()){
            String[] date = sc.nextLine().split("/");
            Calendar c = Calendar.getInstance();
            c.set(Integer.parseInt(date[0])+100, Integer.parseInt(date[1])-1, Integer.parseInt(date[2]));
//            DateFormat sdf = DateFormat.getDateInstance(DateFormat.LONG,new Locale("uk","UA"));
//            Day day = Day.values()[Calendar.DAY_OF_MONTH];
            String s = String.format("%1$tY %1$tm %1$tA", c);
            //System.out.printf("Ваше столетие наступит %s %s",sdf.format(c.getTime()),day);
            System.out.println(s);
        }
    }
}

package Calendar;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        c.set(Calendar.YEAR, 2087);
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DAY_OF_MONTH, 13);
        DateFormat sdf = DateFormat.getDateInstance(DateFormat.LONG,new Locale("uk","UA"));
        System.out.println(sdf.format(c.getTime()));
        DateFormat stf = DateFormat.getTimeInstance(DateFormat.LONG,new Locale("uk","UA"));
        System.out.println(stf.format(c.getTime()));
    }
}

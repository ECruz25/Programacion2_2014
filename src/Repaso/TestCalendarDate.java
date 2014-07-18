
package Repaso;
import java.util.Calendar;
import java.util.Date;
public class TestCalendarDate {
    public static void main(String[] args) {
        //DATE
        Date antes = new Date(100);
        Date hoy = new Date();
        System.out.println(hoy);
        System.out.println("Mili de ahora: " + hoy.getTime());
        if(hoy.getTime() > antes.getTime())
            System.out.println("ok hoy paso despues que antes");
        if(hoy.after(antes))
            System.out.println("ok ahora paso despues que antes");
        if(hoy.before(hoy))
            System.out.println("ok antes paso despues que hoy");
        
        long diff = hoy.getTime()- antes.getTime();
        //Calendar
        Calendar c = Calendar.getInstance();
        //pasar a date
        System.out.println(c.getTime());
        c.set(1996, Calendar.JUNE, 19);
        System.out.println(c.getTime());
        System.out.println(Calendar.YEAR);
        c.add(Calendar.YEAR, -1);
        System.out.println(c.getTime());
    }
}

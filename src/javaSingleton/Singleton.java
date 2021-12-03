package javaSingleton;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class Singleton {
    private Date t;
    private String df;

    private static volatile Singleton instance;

    private Singleton(){};


    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Date getTime() {
        Calendar cal = Calendar.getInstance();
        t = cal.getTime();
        return t;
    }

    public String dateFormat() {
        DateFormat format = DateFormat.getDateInstance();
        df = format.format(t);
        return df;
    }

}

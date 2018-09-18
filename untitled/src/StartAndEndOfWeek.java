import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StartAndEndOfWeek {
    public static void main (String[] args){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEEEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i=0; i<6 ; i++){
            c.add(Calendar.DATE,1);
        }
        System.out.println(df.format(c.getTime()));
    }
}

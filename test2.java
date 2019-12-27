import java.io.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test2 {

    public static void main(String[] args) throws IOException, ParseException {
        Map<Date, String> m = new HashMap<Date, String>(); 

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
        m.put(new java.sql.Date(dateFormat.parse("31-05-2011").getTime()), "A");
        m.put(new java.sql.Date(dateFormat.parse("01-06-2011").getTime()), "B");
        m.put(new java.sql.Date(dateFormat.parse("10-06-2011").getTime()),"C");
        m.put(new java.sql.Date(dateFormat.parse("25-05-2011").getTime()),"D");
    
    
        Map<Date, String> m1 = new TreeMap(m);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
        for (Map.Entry<Date, String> entry : m1.entrySet())
        {
            System.out.println(df.format(entry.getKey())+ " " + entry.getValue().toString());
        }
    }
    
}
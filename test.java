import java.io.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test {

    public static void main(final String[] args) throws IOException, ParseException {
        //reading txt file to an array list
        File file = new File("input.txt");
        FileReader fr = new FileReader(file);
        char temparr[] = new char[(int) file.length()];
        fr.read(temparr,0,(int) file.length());
        String [] tempstring = (new String(temparr)).split("\n");
        //converting arraylist to 2d arraylist
        String array2d[][] = new String [tempstring.length][];
        for(int i=0 ; i<tempstring.length; i++)
        {
            array2d[i]=tempstring[i].split(" ");  
                         
        }
        //mapping 2d array values with hashmap and parsing string keys to date
        final Map<Date, String> map = new HashMap<Date, String>(array2d.length);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        final int N = array2d.length;

        
        for (String[] mapping : array2d)
        {
            map.put(new java.sql.Date(dateFormat.parse(mapping[0]).getTime()), mapping[1]);
        }
        //for sorting multikeys by date using treemap
        
        
        Map<Date, String> m1 = new TreeMap(map);
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        
        int i = 6;
        
        for (Map.Entry<Date, String> entry : m1.entrySet())
        {
            if (i++ > N) {
            System.out.println(df.format(entry.getKey())+ " " + entry.getValue().toString());
            }
        }   
    }
}

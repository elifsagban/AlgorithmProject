import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test3 {

    /**
     * @param args
     * @throws IOException
     * @throws ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {
        // TODO Auto-generated method stub

        File file = new File("input.txt");
        FileReader fr = new FileReader(file);
        char temparr[] = new char[(int) file.length()];
        fr.read(temparr,0,(int) file.length());
        String [] tempstring = (new String(temparr)).split("\n");
        String array2d[][] = new String [tempstring.length][];
        for(int i=0 ; i<tempstring.length; i++)
        {
            array2d[i]=tempstring[i].split(" ");  
                         
        }
        //System.out.println(array2d[0][0]);
        //System.out.println(array2d[0][1]);
        Map<Date, String> m = new HashMap<Date, String>(); 

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
    
        m.put(new java.sql.Date(dateFormat.parse(array2d[0][0]).getTime()), array2d[0][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[1][0]).getTime()), array2d[1][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[2][0]).getTime()), array2d[2][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[3][0]).getTime()), array2d[3][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[4][0]).getTime()), array2d[4][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[5][0]).getTime()), array2d[5][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[6][0]).getTime()), array2d[6][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[7][0]).getTime()), array2d[7][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[8][0]).getTime()), array2d[8][1]);
        m.put(new java.sql.Date(dateFormat.parse(array2d[9][0]).getTime()), array2d[9][1]);


    
    
        Map<Date, String> m1 = new TreeMap(m);
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        
    
        for (Map.Entry<Date, String> entry : m1.entrySet())
        {
            System.out.println(df.format(entry.getKey())+ " " + entry.getValue().toString());
        }

    }

}
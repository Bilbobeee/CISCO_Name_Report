import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\\\1.txt"));

        String line = "";
        ArrayList<String> list = new ArrayList<>();
        String[] as = null;
        int ab = 0;
        TreeMap<String,Integer> map = new TreeMap<>();

        while (reader.ready()){
            line = reader.readLine();
            as = new String[line.length()];
            as = line.split(",");

//            ab = ab+1;
//            System.out.println(ab + " \t " + as[1]);

            map.put(as[1],ab);

        }

        for (Map.Entry<String,Integer> e : map.entrySet()) {
            ab = ab+1;
            System.out.println(ab + "\t " + e.getKey());
        }
    }
}

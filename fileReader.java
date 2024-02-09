package EmailGenerator;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class fileReader {
    public static List<String> fnames = new ArrayList<>();
    public static List<String> lnames = new ArrayList<>();

    public fileReader() {
        String file = "EmailGenerator\\employee.csv";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if (row.length >= 2) { // Ensure there are at least two elements in the row
                    fnames.add(row[0]);
                    lnames.add(row[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

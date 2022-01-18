
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;


public class Main {
    public static void main(String[] args) {
        /*
        try (InputStream input = new FileInputStream("src/main/resources/config")) {
            Properties prop = new Properties();
            prop.load(input);
            int numRows= Integer.parseInt(prop.getProperty("maxRowsNumber"));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

         */
        int property = Config.DATA.getValue1();
        System.out.println(property);

        MadaReportsReader madaReportsReader=new MadaReportsReader("csv","src/main/resources/MadaReports.csv");
        List<MadaReports> madaReports=madaReportsReader.readFromCSV();
        JsonWrite jsonWrite=new JsonWrite();
        jsonWrite.managerOfOpenFiles(madaReports);







    }
}

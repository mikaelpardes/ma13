
import java.util.List;


public class Main {
    public static void main(String[] args) {
        MadaReportsReader madaReportsReader = new MadaReportsReader("csv", "src/main/resources/MadaReports.csv");
        List<MadaReports> madaReports = madaReportsReader.readFromCSV();
        JsonWrite jsonWrite = new JsonWrite();
        jsonWrite.managerOfOpenFiles(madaReports);
    }
}

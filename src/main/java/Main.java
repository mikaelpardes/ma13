
import OpenObject.MadaReports;
import ReadFile.MadaReportsReader;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        MadaReportsReader madaReportsReader = new MadaReportsReader("csv", "src/main/resources/OpenObject.MadaReports.csv");
        List<MadaReports> madaReports = madaReportsReader.readFromCSV();
        JsonWrite jsonWrite = new JsonWrite();
        jsonWrite.managerOfOpenFiles(madaReports);
    }
}

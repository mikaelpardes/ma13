package ReadFile;

import OpenObject.MadaReports;
import ReadFile.CsvReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MadaReportsReader extends CsvReader {

    public MadaReportsReader(String dataKind,String filePath) {
        super(dataKind,filePath);
    }

    public List<MadaReports> readFromCSV() {
        List<MadaReports> m1 = new ArrayList<>();
        Path pathToFile = Paths.get(getFilePath());
        try (BufferedReader br = new BufferedReader(new FileReader(getFilePath()))) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                MadaReports madaReports = createListOfObjects(attributes);
                m1.add(madaReports);
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return m1;
    }

    public MadaReports createListOfObjects(String[] records) {
        String mdaCode = records[0];
        String idNum = records[1];
        String idType = records[2];
        String firstName = records[3];
        String lastName = records[4];
        String city = records[5];
        String street = records[6];
        String buildingNumber = records[7];
        String barCode = records[8];
        String getDate = records[9];
        String takeDate = records[10];
        String resultDate = records[11];
        return new MadaReports(mdaCode, idNum, idType, firstName, lastName, city, street, buildingNumber, barCode, getDate, takeDate, resultDate);

    }
}

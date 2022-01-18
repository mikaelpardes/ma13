import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LabTestsReader extends CsvReader {

    public LabTestsReader(String dataKind, String filePath) {
        super(dataKind, filePath);
    }

    public List<LabTest> readFromCSV() {
        List<LabTest> m1 = new ArrayList<>();
        Path pathToFile = Paths.get(getFilePath());
        try (BufferedReader br = new BufferedReader(new FileReader(getFilePath()))) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                LabTest labTests = createListOfObjects(attributes);
                m1.add(labTests);
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return m1;
    }

    public LabTest createListOfObjects(String[] records) {
        String idNum = records[0];
        String idType = records[1];
        String firstName = records[2];
        String lastName = records[3];
        String resultDate = records[4];
        String birthDate = records[5];
        String labCode = records[6];
        String stickerNumber = records[7];
        String resultTestCorona = records[8];
        String variant = records[9];
        String testType = records[10];

        return new LabTest(idNum, idType, firstName, lastName,resultDate , birthDate, labCode, stickerNumber, resultTestCorona, variant, testType);




    }
}

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        MadaReportsReader madaReportsReader = new MadaReportsReader("csv", "src/main/resources/MadaReports.csv");
        List<MadaReports> madaReports = madaReportsReader.readFromCSV();
        JsonWrite jsonWrite = new JsonWrite();
        jsonWrite.managerOfOpenFiles(madaReports);

        LabTestsReader labTestsReader = new LabTestsReader("csv", "src/main/resources/LabTests.csv");
        List<LabTest> labTestList= labTestsReader.readFromCSV();
        System.out.println("write down file path");
        Scanner scanner=new Scanner(System.in);
        String filePath=scanner.next();
        XmlWriteLabTests xmlWrite=new XmlWriteLabTests(filePath);
        xmlWrite.writeIntoXmlFile(labTestList);




    }
}

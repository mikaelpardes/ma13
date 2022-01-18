import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonWrite<T>{

    public Integer numberOfFiles(List<T> l1) {
        int maxRowsNumber= Config.DATA.getValue1();
        int minNumberOfFiles= Config.DATA.getValue2();
        int csvRowsNum = l1.size();
        int numOfFiles = minNumberOfFiles;
        if (csvRowsNum > maxRowsNumber) {
            numOfFiles += csvRowsNum / maxRowsNumber;
        }
        return numOfFiles;
    }

    public void opensJsonFiles(List<T> l1) {
        int maxRowsNumber= Config.DATA.getValue1();
        Scanner scanner = new Scanner(System.in);
        String path;
        int rowsStart = Config.DATA.getValue3();
        int rowsInFile = maxRowsNumber / numberOfFiles(l1);

        for (int i = 0; i < numberOfFiles(l1); i++) {
            List<T> l2 = new ArrayList<>();
            System.out.println("please enter file path");
            path = scanner.next();
            int indexInList = 0;
            for (int j = rowsStart; j < rowsInFile; j++) {
                l2.add(indexInList, l1.get(j));
                indexInList++;
            }
            writeIntoJsonFile(path, l2);
            rowsStart = rowsInFile;
            rowsInFile = (maxRowsNumber / numberOfFiles(l1)) * (i + 2);
        }
    }

    public void openJsonFile(List<T> l1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter file path");
        String path = scanner.next();
        writeIntoJsonFile(path, l1);
    }

    public void writeIntoJsonFile(String path, List<T> l1) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(Paths.get(path).toFile(), l1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void managerOfOpenFiles(List<T> l1) {
        int minNumberOfFiles= Config.DATA.getValue2();
        if (numberOfFiles(l1) > minNumberOfFiles) {
            opensJsonFiles(l1);
        } else {
            openJsonFile(l1);
        }
    }
}

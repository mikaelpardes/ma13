
import java.util.ArrayList;
import java.util.List;

public class CsvReader<T> extends DataReader {

    private String filePath;
    public CsvReader(String dataKind,String filePath) {
        super(dataKind);
        this.filePath=filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<T> readFromCSV(){
        return new ArrayList<>();
    }

    public T createListOfObjects(String[] records){
        T t = null;
        return null;
    }

}


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum Config {DATA;

    private Integer value1;
    private Integer value2;
    private Integer value3;

    Config() {
        try (InputStream input = new FileInputStream("src/main/resources/config")) {
            Properties prop = new Properties();
            prop.load(input);
            this.value1= Integer.parseInt(prop.getProperty("maxRowsNumber"));
            this.value2=Integer.parseInt(prop.getProperty("minNumberOfFiles"));
            this.value3=Integer.parseInt(prop.getProperty("firstRowNumber"));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public Integer getValue1() {return value1;}
    public Integer getValue2() {return value2;}

    public Integer getValue3() {
        return value3;
    }
}


import java.util.ArrayList;
import java.util.List;


public class LabTestList {
    private List<LabTest> labTests;

    public LabTestList() {
       this.labTests=new ArrayList<LabTest>();
    }

    public List<LabTest> getLabTests() {
        return labTests;
    }
    public void add(LabTest p){
        this.labTests.add(p);
    }

    public void setLabTests(List<LabTest> labTests) {
        this.labTests = labTests;
    }
}

import java.util.ArrayList;
import java.util.List;

public class LabTestWithExtraInfoList {
    private List<LabTestWithExtraInfo> labTests;

    public LabTestWithExtraInfoList() {
        this.labTests=new ArrayList<LabTestWithExtraInfo>();
    }

    public List<LabTestWithExtraInfo> getLabTests() {
        return labTests;
    }
    public void add(LabTestWithExtraInfo p){
        this.labTests.add(p);
    }

    public void setLabTests(List<LabTestWithExtraInfo> labTests) {
        this.labTests = labTests;
    }
}

public class LabTest extends BuildObject {
private String birthdate;
private  String labCode;
private String stickerNumber;
private String resultTestCorona;
private String variant;
private String testType;


    public LabTest(String idNum, String idType, String firstName, String lastName,
                   String resultDate, String birthdate, String labCode, String stickerNumber, String resultTestCorona, String variant, String testType){
        super(idNum,idType,firstName,lastName,resultDate);
        this.birthdate=birthdate;
        this.labCode=labCode;
        this.stickerNumber=stickerNumber;
        this.resultTestCorona=resultTestCorona;
        this.variant=variant;
        this.testType=testType;

    }

    public LabTest (LabTest l1){
        super(l1.getIdNum(),l1.getIdType(),l1.getFirstName(),l1.getLastName(),l1.getResultDate());
    }


    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public void setStickerNumber(String stickerNumber) {
        this.stickerNumber = stickerNumber;
    }

    public String getResultTestCorona() {
        return resultTestCorona;
    }

    public void setResultTestCorona(String resultTestCorona) {
        this.resultTestCorona = resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}

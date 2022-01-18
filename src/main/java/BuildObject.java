public abstract class BuildObject {
    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String resultDate;

    public BuildObject(String idNum,String idType,String firstName,String lastName,String resultDate){
        this.idNum=idNum;
        this.idType=idType;
        this.firstName=firstName;
        this.lastName=lastName;
        this.resultDate=resultDate;

    }

    public BuildObject idNum (String idNum){
        this.idNum=idNum;
        return this;
    }

    public BuildObject idType(String idType){
        this.idType=idType;
        return this;
    }
    public BuildObject firstName(String firstName){
        this.firstName=firstName;
        return this;
    }
    public BuildObject lastName(String lastName){
        this.lastName=lastName;
        return this;
    }

    public BuildObject resultDate(String resultDate){
        this.resultDate=resultDate;
        return this;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }
}

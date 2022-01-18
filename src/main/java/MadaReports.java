public class MadaReportsBuilder extends BuildObject{
    private String mdaCode;
    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String buildingNumber;
    private String barCode;
    private String getDate;
    private String takeDate;
    private String resultDate;

    public MadaReportsBuilder madacode(String madaCode){
        this.mdaCode=madaCode;
        return this;
    }

    public MadaReportsBuilder idNum (String idNum){
        this.idNum=idNum;
        return this;
    }

    public MadaReportsBuilder idType(String idType){
        this.idType=idType;
        return this;
    }
    public MadaReportsBuilder firstName(String firstName){
        this.firstName=firstName;
        return this;
    }
    public MadaReportsBuilder lastName(String lastName){
        this.lastName=lastName;
        return this;
    }

    public MadaReportsBuilder city(String city){
        this.city=city;
        return this;
    }

    public MadaReportsBuilder street(String street){
        this.street=street;
        return this;
    }

    public MadaReportsBuilder buildingNumber(String buildingNumber){
       this.buildingNumber=buildingNumber;
        return this;
    }

    public MadaReportsBuilder barCode(String barCode){
        this.barCode=barCode;
        return this;
    }

    public MadaReportsBuilder getDate(String getDate){
        this.getDate=getDate;
        return this;
    }

    public MadaReportsBuilder takeDate(String takeDate){
       this.takeDate=takeDate;
        return this;
    }

    public MadaReportsBuilder resultDate(String resultDate){
       this.resultDate=resultDate;
        return this;
    }

    public String getMdaCode() {
        return mdaCode;
    }

    public void setMdaCode(String mdaCode) {
        this.mdaCode = mdaCode;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public String getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(String takeDate) {
        this.takeDate = takeDate;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    @Override
    public String toString() {
        return "MadaReports{" +
                "mdaCode='" + mdaCode + '\'' +
                ", idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", barCode='" + barCode + '\'' +
                ", getDate='" + getDate + '\'' +
                ", takeDate='" + takeDate + '\'' +
                ", resultDate='" + resultDate + '\'' +
                '}';
    }
}

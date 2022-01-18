public class MadaReports extends BuildObject {
    private String mdaCode;
    private String city;
    private String street;
    private String buildingNumber;
    private String barCode;
    private String getDate;
    private String takeDate;


    public MadaReports(String mdaCode,String idNum,String idType,String firstName,String lastName,
                       String city,String street,String buildingNumber,String barCode,String getDate,String takeDate,String resultDate){
        super(idNum,idType,firstName,lastName,resultDate);
        this.mdaCode=mdaCode;
        this.city=city;
        this.street=street;
        this.buildingNumber=buildingNumber;
        this.barCode=barCode;
        this.getDate=getDate;
        this.takeDate=takeDate;
    }

    public MadaReports madacode(String madaCode){
        this.mdaCode=madaCode;
        return this;
    }

    public MadaReports city(String city){
        this.city=city;
        return this;
    }

    public MadaReports street(String street){
        this.street=street;
        return this;
    }

    public MadaReports buildingNumber(String buildingNumber){
       this.buildingNumber=buildingNumber;
        return this;
    }

    public MadaReports barCode(String barCode){
        this.barCode=barCode;
        return this;
    }

    public MadaReports getDate(String getDate){
        this.getDate=getDate;
        return this;
    }

    public MadaReports takeDate(String takeDate){
       this.takeDate=takeDate;
        return this;
    }



    public String getMdaCode() {
        return mdaCode;
    }

    public void setMdaCode(String mdaCode) {
        this.mdaCode = mdaCode;
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


    @Override
    public String toString() {
        return "MadaReports{" +
                "mdaCode='" + mdaCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", barCode='" + barCode + '\'' +
                ", getDate='" + getDate + '\'' +
                ", takeDate='" + takeDate + '\'' +
                '}';
    }
}

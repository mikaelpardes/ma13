public abstract class DataReader{
    private String dataKind;
    public DataReader(String dataKind){
        this.dataKind=dataKind;
    }

    public String getDataKind() {
        return dataKind;
    }

    public void setDataKind(String dataKind) {
        this.dataKind = dataKind;
    }
}

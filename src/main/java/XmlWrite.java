public abstract class XmlWrite {
    private String filepath;
    public XmlWrite(String filepath){
        this.filepath=filepath;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}

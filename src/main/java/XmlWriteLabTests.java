import com.thoughtworks.xstream.XStream;
import java.io.*;
import java.util.List;


public class XmlWriteLabTests extends XmlWrite {
    public XmlWriteLabTests(String filepath) {
        super(filepath);
    }

    public String convertListInoXml(List<LabTest>labTestList){
        XStream xstream = new XStream();
        xstream.alias("LabTest", LabTest.class);
        xstream.alias("LabTests", LabTestList.class);
        xstream.addImplicitCollection(LabTestList.class, "labTests");
        LabTestList list = new LabTestList();
        for (LabTest labTest : labTestList) {
            list.add(labTest);
        }
        return xstream.toXML(list);
    }

    public void writeIntoXmlFile(List<LabTest>labTestList) throws FileNotFoundException, UnsupportedEncodingException {
        String xml=convertListInoXml(labTestList);
        PrintWriter writer = new PrintWriter(this.getFilepath(), "UTF-8");
        writer.println(xml);
    }



}




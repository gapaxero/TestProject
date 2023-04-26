package testJackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import testJackson.JacksonTool.XmlTool;
import testJackson.POJO.XMLTestPOJO;

public class TestJacksonXml {

    public static void main(String[] args) throws Exception {
        XMLTestPOJO.ShipmentNos model = new XMLTestPOJO.ShipmentNos();

        model.setChkMac("AA");
        model.setEshopId("BB");
        model.setOrderNo("CC");
        model.setParentId("DD");
        model.setFlowType("EE");
        model.setOrderDate("FF");

        String xmlStr = object2Xml(model);
        String xmlStr2 = XmlTool.objToXml(model);

        System.out.println(xmlStr);
        System.out.println(xmlStr2);

    }

    public static String object2Xml(Object object) {
        try {
            ObjectMapper objectMapper = new XmlMapper();
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

}

package testJackson.JacksonTool;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;

import static com.ctc.wstx.api.WstxOutputProperties.P_USE_DOUBLE_QUOTES_IN_XML_DECL;

/**
 * @Author 1091522
 * @Description
 */
public class XmlTool {

    private static final XmlMapper xmlMapper;

    static {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        xmlInputFactory.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, false);

        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
        xmlOutputFactory.setProperty(XMLOutputFactory.IS_REPAIRING_NAMESPACES, true);

        xmlMapper = new XmlMapper(xmlInputFactory, xmlOutputFactory);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        xmlMapper.getFactory().getXMLOutputFactory().setProperty(P_USE_DOUBLE_QUOTES_IN_XML_DECL, true);
    }

    public static String objToXml(Object obj) {
        try {
            return xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static JsonNode readTree(String str) {
        try {
            return xmlMapper.readTree(str);
        } catch (Exception e) {
            return null;
        }
    }

}

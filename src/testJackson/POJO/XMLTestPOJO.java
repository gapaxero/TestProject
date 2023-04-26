package testJackson.POJO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * @Author 1091522
 * @Description
 */

@Data
@JacksonXmlRootElement(localName = "Doc")
public class XMLTestPOJO {

    @Data
    @JacksonXmlRootElement(localName = "ShipmentNos")
    public static class ShipmentNos {

        @JacksonXmlProperty(localName = "ParentId")
        private String ParentId;

        @JacksonXmlProperty(localName = "EshopId")
        private String EshopId;

        @JacksonXmlProperty(localName = "OrderNo")
        private String OrderNo;

        @JacksonXmlProperty(localName = "EcOrderNo")
        private String EcOrderNo;

        @JacksonXmlProperty(localName = "RcvStoreId")
        private String RcvStoreId;

        @JacksonXmlProperty(localName = "OrderDate")
        private String OrderDate; // yyyy-mm-dd HH:mm:ss

        @JacksonXmlProperty(localName = "FlowType")
        private String FlowType; // N:進貨(取件店進店)

        @JacksonXmlProperty(localName = "ChkMac")
        private String ChkMac;

    }

}

package deyi.com.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Station")
public class StationParamXml {
    @XmlAttribute(required = true, name = "name")
    private String name;
    @XmlAttribute(required = true, name = "id")
    private String id;
    @XmlElement(required = true, name = "Param", type = Param.class)
    private List<Param> paramList;

    @Setter
    @Getter
    @ToString
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Param {
        @XmlAttribute(required = true, name = "key")
        private String key;
        @XmlAttribute(required = true, name = "value")
        private String value;
    }
}
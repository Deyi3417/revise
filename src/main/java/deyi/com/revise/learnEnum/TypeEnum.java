package deyi.com.revise.learnEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : HP
 * @date : 2023/2/3
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum TypeEnum {
    ONE(1,"红"),
    TWO(2,"橙"),
    THREE(3,"黄"),
    FOUR(4,"绿"),
    FIVE(5,"青"),
    SIX(6,"蓝"),
    SEVEN(7,"紫");
    private Integer code;
    private String name;

    public static final Map<Integer, TypeEnum> TYPE_MAP = new HashMap<>();

    static {
        for (TypeEnum type : TypeEnum.values()) {
            TYPE_MAP.put(type.code, type);
        }
    }

    public static String getNameByCode(Integer code) {
        if (code != null) {
            TypeEnum typeEnum = TYPE_MAP.get(code);
            return typeEnum == null ? StringUtils.EMPTY : typeEnum.getName();
        }
        return StringUtils.EMPTY;
    }


}

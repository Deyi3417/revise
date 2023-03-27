package deyi.com.learning;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : 刘德意
 * @date : 2023/3/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("省份信息")
public class Province implements Serializable {

    private static final long serialVersionUID = -5945892250779769621L;

    @ApiModelProperty(value = "id",name = "省份编号")
    private Integer id;

    @ApiModelProperty(value = "name",name = "省份名称")
    private String name;

}

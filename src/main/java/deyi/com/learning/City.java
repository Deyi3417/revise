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
@ApiModel("城市信息")
public class City implements Serializable {

    private static final long serialVersionUID = -4478378752271595671L;

    @ApiModelProperty(value = "id",name = "城市编号")
    private Integer id;

    @ApiModelProperty(value = "name",name = "城市名称")
    private String name;

    @ApiModelProperty(value = "pid",name = "所属省份编号")
    private Integer pid;
}

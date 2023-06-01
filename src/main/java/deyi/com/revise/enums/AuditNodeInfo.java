package deyi.com.revise.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : liudy23
 * @date : 2023/05/25
 */
@Data
@ApiModel("审批节点信息")
@AllArgsConstructor
public class AuditNodeInfo implements Serializable {

    private static final long serialVersionUID = 8229220912831886296L;

    @ApiModelProperty(name = "nodeCode", value = "节点编码")
    private String nodeCode;

    @ApiModelProperty(name = "nodeName", value = "节点名称")
    private String nodeName;

    @ApiModelProperty(name = "sort", value = "排序")
    private Integer sort;
}
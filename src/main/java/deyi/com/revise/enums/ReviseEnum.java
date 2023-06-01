package deyi.com.revise.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;

/**
 * @author : HP
 * @date : 2023/5/25
 */
public class ReviseEnum {
    @Getter
    @AllArgsConstructor()
    @NoArgsConstructor
    public enum RejectNodesEnum {
        _1("qc_sqe","质量工程师审批","",1),
        _2("qc_devApprove","研发评审","qc_sqe",11),
        _3("qc_projectManager_director","项目经理/所长审批","qc_sqe,qc_devApprove",21),
        _4("qc_technologyApprove","工艺评审","qc_sqe,qc_devApprove",31),
        _5("qc_qualityDirector","质保总监审批","qc_sqe,qc_devApprove,qc_technologyApprove",41),
        _6("qc_managerApprove","总经理审批","qc_projectManager_director,qc_qualityDirector",51),
        _7("qc_manufactureHandle","制造处置","qc_technologyApprove",61),
        _8("qc_manufactureOrder","制造下单","",71),
        _9("qc_businessDisposal","商务处置","qc_sqe,qc_devApprove,qc_technologyApprove",81),
        _10("qc_qualityRecheck","质保再检","qc_sqe,qc_manufactureHandle",91),
        _11("qc_claim","商务执行索赔","",101);
        private String node;
        private String nodeName;
        private String canRejectNode;
        private Integer sort;
        public static RejectNodesEnum getRejectNodeByNode(String node) {
            return Arrays.stream(values()).filter(e -> e.getNode().equals(node)).findFirst().orElse(null);
        }
    }
}

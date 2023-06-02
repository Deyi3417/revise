package deyi.com.revise.stream;

import deyi.com.revise.domain.FlowNodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : HP
 * @date : 2023/6/1
 */
public class IntersectionTwoList {

    public static void main(String[] args) {
        List<FlowNodes> canRejectNodes = getCanRejectNodes();
        List<FlowNodes> selectedNodes = getSelectedNodes();
        List<String> selectNodeCodes = selectedNodes.stream().map(FlowNodes::getNodeCode).collect(Collectors.toList());
        List<FlowNodes> collect = canRejectNodes.stream().filter(node -> selectNodeCodes.contains(node.getNodeCode())).collect(Collectors.toList());
        System.out.println(collect);

    }

    public static List<FlowNodes> getCanRejectNodes() {
        return Arrays.asList(
                new FlowNodes("qc_sqe", "质量工程师审批"),
                new FlowNodes("qc_manufactureHandle", "制造处置")
        );
    }

    public static List<FlowNodes> getSelectedNodes() {
        return Arrays.asList(
                new FlowNodes("qc_sqe", "质量工程师审批"),
                new FlowNodes("qc_devApprove", "研发评审"),
                new FlowNodes("qc_businessDisposal", "商务处置"),
                new FlowNodes("qc_qualityRecheck", "质保再检")
        );
    }

}



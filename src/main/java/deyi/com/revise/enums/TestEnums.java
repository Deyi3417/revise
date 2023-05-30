package deyi.com.revise.enums;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : HP
 * @date : 2023/5/25
 */
public class TestEnums {
    public static void main(String[] args) {
        List<AuditNodeInfo> result = getRejectNode("qc_projectManager_director");
        System.out.println("result : " + JSON.toJSONString(result));
    }
    public static List<AuditNodeInfo> getRejectNode(String currentNode) {
        List<AuditNodeInfo> nodeInfos = new ArrayList<>();
        ReviseEnum.RejectNodesEnum rejectNodeByNode = ReviseEnum.RejectNodesEnum.getRejectNodeByNode(currentNode);
        if (rejectNodeByNode != null) {
            String canRejectNode = rejectNodeByNode.getCanRejectNode();
            List<String> nodes = Arrays.asList(canRejectNode.split(","));
            nodes.forEach(e->{
                ReviseEnum.RejectNodesEnum nodeTemp = ReviseEnum.RejectNodesEnum.getRejectNodeByNode(e);
                if (nodeTemp != null) {
                    AuditNodeInfo auditNodeInfo = new AuditNodeInfo(nodeTemp.getNode(), nodeTemp.getNodeName(), nodeTemp.getSort());
                    nodeInfos.add(auditNodeInfo);
                }
            });
        }
        return nodeInfos;
    }
}

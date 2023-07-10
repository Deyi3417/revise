package deyi.com.revise.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 实现获取当前节点前已选取的所有节点的功能
 * @date 2023-07-05
 */
public class NodeSelection {
    public static List<Integer> getSelectedNodesBefore(int currentNode, List<Integer> selectedNodes) {
        List<Integer> result = new ArrayList<>();

        for (int node : selectedNodes) {
            if (node == currentNode) {
                result.add(node);
                break;
            }
            result.add(node);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> selectedNodes = Arrays.asList(1, 3, 4, 6, 8, 9);
        int currentNode = 6;

        List<Integer> nodesBeforeCurrent = getSelectedNodesBefore(currentNode, selectedNodes);
        System.out.println(nodesBeforeCurrent);
    }
}

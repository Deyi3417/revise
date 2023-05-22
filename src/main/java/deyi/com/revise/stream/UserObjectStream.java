package deyi.com.revise.stream;

import com.alibaba.fastjson.JSON;
import deyi.com.revise.domain.WorkOrderReport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : HP
 * @date : 2023/5/15
 */
public class UserObjectStream {
    public static void main(String[] args) {
        List<WorkOrderReport> workOrderReports = obtainOrderReport();
        testData(workOrderReports);
    }

    public static void testData(List<WorkOrderReport> workOrderReports) {
        Map<String, Map<String, Integer>> result = new HashMap<>();
        for (WorkOrderReport workOrderReport : workOrderReports) {
            Map<String, Integer> aufnrIdMap = new HashMap<>();
            String key = workOrderReport.getLtxa1() + workOrderReport.getVornr();
            if (result.containsKey(key)) {
                aufnrIdMap.get(workOrderReport.getLtxa1());
            }
            aufnrIdMap.put(workOrderReport.getAufnr(), workOrderReport.getId());
            // 此处把名称一致的给替换掉了
            result.put(key, aufnrIdMap);
        }
        System.out.println("获取到的result:\n" + result);
        System.out.println("获取到的result JSON格式化:\n" + JSON.toJSONString(result));


        List<WorkOrderReport> batchInsertList = new ArrayList<>();
        List<WorkOrderReport> batchUpdateList = new ArrayList<>();
// 遍历传过来的报工的工序数据信息
        for (WorkOrderReport info : workOrderReports) {
            String key = info.getLtxa1() + info.getVornr();
            if (result.containsKey(key)) {
                Map<String, Integer> xx = result.get(key);
                Integer id = xx.get(info.getAufnr());
                if (id != null) {
                    info.setId(id);
                    batchUpdateList.add(info);
                    continue;
                }
            }
            batchInsertList.add(info);
        }
        System.out.println("batchUpdateList:\n" + batchUpdateList);
        System.out.println("batchInsertList:\n" + batchInsertList);

    }

    public static List<WorkOrderReport> obtainOrderReport() {
        List<WorkOrderReport> result = new ArrayList<>();
        WorkOrderReport workOrderReport = new WorkOrderReport();
        workOrderReport.setAblad("");
        workOrderReport.setArbpl("S00060");
        workOrderReport.setAufnr("810000238024");
        workOrderReport.setErsda(null);
        workOrderReport.setGamng(1D);
        workOrderReport.setGhName("");
        workOrderReport.setGxsta("");
        workOrderReport.setIsm02(1584D);
        workOrderReport.setKtext("调试中心-整机调试");
        workOrderReport.setLtxa1("单机调试");
        workOrderReport.setMaktx("TEFR12化成设备主体");
        workOrderReport.setMatnr("FGM100000001");
        workOrderReport.setSteus("SY03");
        workOrderReport.setUpdateTime(null);
        workOrderReport.setVornr("0010");
        workOrderReport.setId(35194);
        result.add(workOrderReport);

        WorkOrderReport workOrderReport1 = new WorkOrderReport();
        workOrderReport1.setAblad("");
        workOrderReport1.setArbpl("S00054");
        workOrderReport1.setAufnr("810000238024");
        workOrderReport1.setErsda(null);
        workOrderReport1.setGamng(1D);
        workOrderReport1.setGhName("");
        workOrderReport1.setGxsta("");
        workOrderReport1.setIsm02(864D);
        workOrderReport1.setKtext("装配中心-电气装配");
        workOrderReport1.setLtxa1("电气预装");
        workOrderReport1.setMaktx("TEFR12化成设备主体");
        workOrderReport1.setMatnr("FGM100000001");
        workOrderReport1.setSteus("SY03");
        workOrderReport1.setUpdateTime(null);
        workOrderReport1.setVornr("0020");
        workOrderReport1.setId(35195);
        result.add(workOrderReport1);

        WorkOrderReport workOrderReport2 = new WorkOrderReport();
        workOrderReport2.setAblad("");
        workOrderReport2.setArbpl("S00050");
        workOrderReport2.setAufnr("810000238024");
        workOrderReport2.setErsda(null);
        workOrderReport2.setGamng(1D);
        workOrderReport2.setGhName("");
        workOrderReport2.setGxsta("");
        workOrderReport2.setIsm02(1200D);
        workOrderReport2.setKtext("装配中心-小件装配");
        workOrderReport2.setLtxa1("小件装配");
        workOrderReport2.setMaktx("TEFR12化成设备主题");
        workOrderReport2.setMatnr("FGM100000001");
        workOrderReport2.setSteus("SY03");
        workOrderReport2.setUpdateTime(null);
        workOrderReport2.setVornr("0030");
        workOrderReport2.setId(35196);
        result.add(workOrderReport2);

        WorkOrderReport workOrderReport3 = new WorkOrderReport();
        workOrderReport3.setAblad("");
        workOrderReport3.setArbpl("S00060");
        workOrderReport3.setAufnr("810000238024");
        workOrderReport3.setErsda(null);
        workOrderReport3.setGamng(1D);
        workOrderReport3.setGhName("");
        workOrderReport3.setGxsta("");
        workOrderReport3.setIsm02(3288D);
        workOrderReport3.setKtext("调试中心-整机调试");
        workOrderReport3.setLtxa1("单机调试");
        workOrderReport3.setMaktx("TEFR12化成设备主题");
        workOrderReport3.setMatnr("FGM100000001");
        workOrderReport3.setSteus("SY03");
        workOrderReport3.setUpdateTime(null);
        workOrderReport3.setVornr("0040");
        workOrderReport3.setId(35197);
        result.add(workOrderReport3);
        System.out.println("json数据集：" + JSON.toJSONString(result));
        return result;
    }
}

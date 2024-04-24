package deyi.com.revise.project;

import deyi.com.model.FanInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ResolveParam {
    public static List<FanInfo> resolver(String targetJsonString, int rotator) {
        List<FanInfo> res = new ArrayList<>();

        // 按行分割字符串
        String[] lines = targetJsonString.split("\r\n");

        for (String line : lines) {
            // 检查是否是风扇信息的行
            if (line.startsWith("[CCPK_APP]")) {
                // 去除"[CCPK_APP]"部分，然后使用空格拆分
                String[] parts = line.replace("[CCPK_APP]", "").trim().split("\\s+");
                if ("value".equals(parts[0]) || "FanId".equals(parts[0])) {
                    continue;
                }
                if (parts.length == 5) {
                    // 创建FanInfo对象并设置属性值
                    FanInfo fanInfo = new FanInfo();
                    fanInfo.setFanId(parts[0]);
                    fanInfo.setCurrentSpeed(parts[1]);
                    fanInfo.setAreaId(parts[4]);
                    // 添加到结果列表
                    res.add(fanInfo);
                }
            }
        }
        res = res.stream().filter(e -> Objects.equals(e.getAreaId(), String.valueOf(rotator))).collect(Collectors.toList());
        return res;
    }

    public static void main(String[] args) {
        String targetString = "[CCPK_APP][W][App_RegisterEntry][755]Recieve EV_TIMER_1, but can not report ms state for 1AOC not report!\r\n\u001B[@A\u001B[@u\u001B[@t\u001B[@o\u001B[@S\u001B[@p\u001B[@e\u001B[@e\u001B[@d\u001B[@_\u001B[@C\u001B[@l\u001B[@i\u001B[@P\u001B[@r\u001B[@i\u001B[@n\u001B[@t\u001B[@F\u001B[@a\u001B[@n\u001B[@S\u001B[@p\u001B[@e\u001B[@e\u001B[@d\u001B[@L\u001B[@e\u001B[@v\u001B[@e\u001B[@l\u001B[@(\u001B[@)\u001B[0C\u001B[@\r\n[CCPK_APP]FanId CurrentSpeed(U3) CurrentSpeed(EPLD) mode AreaId\r\n[CCPK_APP] 1 50 127 3 1\r\n[CCPK_APP] 2 50 130 3 2\r\n[CCPK_APP] 3 50 130 3 3\r\n[CCPK_APP] 4 50 132 3 4\r\n[CCPK_APP] 5 50 127 3 5\r\n[CCPK_APP] 6 50 127 3 1\r\n[CCPK_APP] 7 50 127 3 2\r\n[CCPK_APP] 8 50 130 3 3\r\n[CCPK_APP] 9 50 130 3 4\r\n[CCPK_APP]10 50 130 3 5\r\n[CCPK_APP]11 25 65535 7 1\r\n[CCPK_APP]12 25 65535 7 2\r\n[CCPK_APP]13 25 65535 7 3\r\n[CCPK_APP]14 25 65535 7 4\r\n[CCPK_APP]15 25 65535 7 5\r\n[CCPK_APP]16 25 65535 7 1\r\n[CCPK_APP]17 25 65535 7 2\r\n[CCPK_APP]18 25 65535 7 3\r\n[CCPK_APP]19 25 65535 7 4\r\n[CCPK_APP]20 25 65535 7 5\r\n[CCPK_APP]value = 0 = 0x0\r\n[CCPK_APP]ushell command finished\u001E\r\n";
        System.out.println(targetString);
        List<FanInfo> fanInfos = resolver(targetString, 1);
        for (FanInfo fanInfo : fanInfos) {
            System.out.println(fanInfo.toString());
        }
    }
}

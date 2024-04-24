package deyi.com.revise.project;

import deyi.com.model.FanInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : liudy23
 * @data : 2024/4/24
 */
public class ResolveParam2 {
    public static List<FanInfo> resolver(String targetJsonString) {
        List<FanInfo> res = new ArrayList<>();
        // 解析目标参数 todo

        return res;
    }

    public static void main(String[] args) {
        String targetString = "[CCPK_APP][W][App_RegisterEntry][755]Recieve EV_TIMER_1, but can not report ms state for 1AOC not report!\r\n\u001B[@A\u001B[@u\u001B[@t\u001B[@o\u001B[@S\u001B[@p\u001B[@e\u001B[@e\u001B[@d\u001B[@_\u001B[@C\u001B[@l\u001B[@i\u001B[@P\u001B[@r\u001B[@i\u001B[@n\u001B[@t\u001B[@F\u001B[@a\u001B[@n\u001B[@S\u001B[@p\u001B[@e\u001B[@e\u001B[@d\u001B[@L\u001B[@e\u001B[@v\u001B[@e\u001B[@l\u001B[@(\u001B[@)\u001B[0C\u001B[@\r\n[CCPK_APP]FanId CurrentSpeed(U3) CurrentSpeed(EPLD) mode AreaId\r\n[CCPK_APP] 1 50 127 3 1\r\n[CCPK_APP] 2 50 130 3 2\r\n[CCPK_APP] 3 50 130 3 3\r\n[CCPK_APP] 4 50 132 3 4\r\n[CCPK_APP] 5 50 127 3 5\r\n[CCPK_APP] 6 50 127 3 1\r\n[CCPK_APP] 7 50 127 3 2\r\n[CCPK_APP] 8 50 130 3 3\r\n[CCPK_APP] 9 50 130 3 4\r\n[CCPK_APP]10 50 130 3 5\r\n[CCPK_APP]11 25 65535 7 1\r\n[CCPK_APP]12 25 65535 7 2\r\n[CCPK_APP]13 25 65535 7 3\r\n[CCPK_APP]14 25 65535 7 4\r\n[CCPK_APP]15 25 65535 7 5\r\n[CCPK_APP]16 25 65535 7 1\r\n[CCPK_APP]17 25 65535 7 2\r\n[CCPK_APP]18 25 65535 7 3\r\n[CCPK_APP]19 25 65535 7 4\r\n[CCPK_APP]20 25 65535 7 5\r\n[CCPK_APP]value = 0 = 0x0\r\n[CCPK_APP]ushell command finished\u001E\r\n";
        System.out.println(targetString);
        resolver(targetString);
    }
}

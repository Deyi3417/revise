package deyi.com.learning.dxfparse;

import org.kabeja.dxf.*;
import org.kabeja.parser.Parser;
import org.kabeja.parser.ParserBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.time.LocalTime.now;

/**
 * @author HP
 */
public class TestParseDxf {
    public static void main(String[] args) throws Exception {
        String dxfFilePath = "D:\\DownloadFile\\GoogleDownload\\2023-05\\kabeja-0.4\\samples\\dxf\\draft1.dxf";
        Parser dxfParser = ParserBuilder.createDefaultParser();
        dxfParser.parse(dxfFilePath, "UTF-8");
        DXFDocument doc = dxfParser.getDocument();
        List<DXFLayer> dxfLayers = getDXFLayers(doc);
        synchronized (System.out) {
            System.out.print("dxf:" + dxfLayers);

        }
        synchronized (System.out) {
            System.out.print("are you ok" + now());

        }
    }

    public static List<DXFLayer> getDXFLayers(DXFDocument dxfdoc) {
        ArrayList<DXFLayer> dxfLayers = new ArrayList<>();
        Iterator iter = dxfdoc.getDXFLayerIterator();
        while (iter.hasNext()) {
            DXFLayer dxfLayer = (DXFLayer) iter.next();
            if (dxfLayer.getName().equals("I-ROOM-NUB")) {
                List<String> list = getDXFEntityTypes(dxfLayer);
                for (String s : list) {
                    synchronized (System.out) {
                        System.out.print("sss:" + s);

                    }
                    if (s.equals("LEADER")) {
                        List<DXFEntity> l = dxfLayer.getDXFEntities(s);
                        for (DXFEntity d : l) {
                            DXFLeader i = (DXFLeader) d;
                            int a = i.getCoordinateCount();
                            for (int k = 0; k < a; k++) {
                                String x = "测试导出：" + i.getCoordinateAt(k);
                                synchronized (System.out) {
                                    System.out.print(x);
                                }
                            }
                        }
                    }
                }
            }
            dxfLayers.add(dxfLayer);
        }
        return dxfLayers;
    }

    /**
     * 通过DXFBlock获取entity
     *
     * @param dXFBlock
     * @return
     */
    public static List<DXFEntity> getEntityByDXFBlock(DXFBlock dXFBlock) {
        List<DXFEntity> list = new ArrayList<DXFEntity>();
        Iterator iter = dXFBlock.getDXFEntitiesIterator();
        while (iter.hasNext()) {
            DXFEntity d = (DXFEntity) iter.next();
//			if(d.isVisibile()){
//				list.add(d);
//			}
            list.add(d);
        }
        return list;
    }

    /**
     * 通过图层获取DXFEntityType
     *
     * @param dXFLayer
     * @return
     */
    public static List<String> getDXFEntityTypes(DXFLayer dXFLayer) {
        List<String> list = new ArrayList<String>();
        Iterator iter = dXFLayer.getDXFEntityTypeIterator();
        while (iter.hasNext()) {
            String d = (String) iter.next();
            list.add(d);
//			System.out.println(d);
        }
        return list;
    }
}

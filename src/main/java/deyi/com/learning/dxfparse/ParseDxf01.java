package deyi.com.learning.dxfparse;

import org.kabeja.dxf.DXFDocument;
import org.kabeja.dxf.DXFLayer;
import org.kabeja.parser.DXFParser;
import org.kabeja.parser.Parser;
import org.kabeja.parser.ParserBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : HP
 * @date : 2023/6/13
 */
public class ParseDxf01 {
    public static final String dxfFilePath = "D:\\DownloadFile\\GoogleDownload\\2023-05\\kabeja-0.4\\samples\\dxf\\draft1.dxf";

    public static void main(String[] args) throws Exception {
        Parser dxfParser = ParserBuilder.createDefaultParser();
        dxfParser.parse(dxfFilePath, DXFParser.DEFAULT_ENCODING);
        DXFDocument document = dxfParser.getDocument();
        List<DXFLayer> dxfLayers = getDXFLayers(document);
        String format = String.format("该DXF图共包含 %d 个图层！", dxfLayers.size());
        synchronized (System.out) {
            System.out.print(format);

        }
        dxfLayers.forEach(dxfLayer -> {
            String x = "当前图层名称：" + dxfLayer.getName();
            synchronized (System.out) {
                System.out.print(x);

            }
            List<String> dxfEntities = getDXFEntities(dxfLayer);
            dxfEntities.forEach(dxfEntity -> {
                String outputEntity = String.format("当前图层名称：%s，当前示例名称：%s", dxfLayer.getName(), dxfEntity);
                synchronized (System.out) {
                    System.out.print(outputEntity);

                }
            });

        });


    }

    /**
     * 获取图层
     *
     * @param dxfLayer
     * @return
     */
    public static List<String> getDXFEntities(DXFLayer dxfLayer) {
        List<String> dxfEntities = new ArrayList<>();
        dxfLayer.getDXFEntityTypeIterator();
        Iterator iterator = dxfLayer.getDXFEntityTypeIterator();
        while (iterator.hasNext()) {
            String nextEntity = (String) iterator.next();
            dxfEntities.add(nextEntity);
        }
        return dxfEntities;
    }

    public static List<DXFLayer> getDXFLayers(DXFDocument document) {
        List<DXFLayer> dxfLayers = new ArrayList<>();
        Iterator iter = document.getDXFLayerIterator();
        while (iter.hasNext()) {
            DXFLayer next = (DXFLayer) iter.next();
            dxfLayers.add(next);
        }
        return dxfLayers;
    }

}

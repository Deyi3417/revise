package deyi.com.revise.strOperation;

import org.springframework.beans.factory.annotation.Value;

import java.net.MalformedURLException;

/**
 * @Author HP
 * @create 2021/11/9 9:39
 */
public class testUrl {
    @Value("${dxf.url}")
    private String dxfUrl;

    public String getDxfUrl() {
        return dxfUrl;
    }

    public void setDxfUrl(String dxfUrl) {
        this.dxfUrl = dxfUrl;
    }

    String urlStr = "D:\\AZ\\feishu\\deyi.txt";

    String targetUrl = dxfUrl + urlStr;

    public static void main(String[] args) throws MalformedURLException {

        String url1 = "http://10.0.11.108:8093/sinomes";
        String url2 = "\\AZ\\feishu\\deyi";
        String url3 = url2.replace("\\","/");
        String resStr = url1 + url3;
        System.out.println(url1);
        System.out.println(url2);
        System.out.println(url3);
        System.out.println(resStr);

    }
}

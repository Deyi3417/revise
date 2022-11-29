package deyi.com.revise.json;

/**
 * @Author HP
 * @create 2021/10/27 9:09
 */
public class elseIf {
    public static void main(String[] args) {
        String shape = "deyi";
        if (shape.equals("deyi")){
            System.out.println("come from hunan.");
        }else if ("suyao".equals(shape)){
            System.out.println("come from beijing.");
        }else if ("chun".equals(shape)){
            System.out.println("come from guangdong.");
        }

        switch (shape){
            case "deyi":
                System.out.println("deyi so handsome!");
                break;
            case "suyao":
                System.out.println("suyao 很善良。");
                break;
            case "chun":
                System.out.println("姐姐人很好。");
                break;
        }
    }

}

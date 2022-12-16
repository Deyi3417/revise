package deyi.com.revise.common;

/**
 * @author : HP
 * @date : 2022/12/16
 */
public enum Color {
    red("red","红"),
    orange("orange","橙"),
    yellow("yellow","黄"),
    green("green","绿"),
    turquoise("turquoise","青"),
    blue("blue","蓝"),
    purple("purple","紫")
    ;

    private String color;
    private String name;

    Color(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public static String valueOfColor(String name) {
        if (name == null) {
            return null;
        } else {
            for (Color color : Color.values()) {
                if (color.getName().equals(name)) {
                    return color.getColor();
                }
            }
        }
        return null;
    }

    public static String valueOfName(String color) {
        if (color == null) {
            return null;
        } else {
            for (Color colorValue : Color.values()) {
                if (colorValue.getColor().equals(color)) {
                    return colorValue.getName();
                }
            }
        }
        return null;
    }




}

package learning_review.domain;

/**
 * @author : HP
 * @date : 2023/2/3
 */
public class TestChangeContent {
    public static void main(String[] args) {
        PageParam pageParam = new PageParam();
        System.out.println(pageParam);
        TestChangeContent testChangeContent = new TestChangeContent();
        System.out.println("调整前size：" + pageParam.getSize());
        System.out.println("调整前current：" + pageParam.getCurrent());
        testChangeContent.defaultValue(pageParam);
        System.out.println("调整后：" + pageParam);
        System.out.println("调整后size：" + pageParam.getSize());
        System.out.println("调整后current：" + pageParam.getCurrent());

    }
    public void defaultValue(PageParam params) {
        Integer current = params.getCurrent();
        Integer size = params.getSize();
        if (current == null) {
            current = 1;
        }
        if (size == null) {
            size = 10;
        }
        params.setCurrent(current);
        params.setSize(size);
    }
}

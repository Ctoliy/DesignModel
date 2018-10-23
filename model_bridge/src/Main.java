/**
 * @create 2018-10-23 14:02 by Toliy
 * @desc 主函数
 **/
public class Main {
    /**
     * 应用场景:比较常见的画笔画画吧，我要画水彩画，配色很简单，就三种颜色，分别为红、蓝、绿
     * 如果需要用蜡笔的画，我们需要分别备上3只蜡笔<且不分粗细大小>
     * 如果需要用毛笔的画，我们需要分别备上1根毛笔<且不分粗细大小>
     */
    public static void main(String[] args) {
        Pen mao = new ExtendPen(new Red());
        mao.print();
        mao = new ExtendPen(new Blue());
        mao.print();
        mao = new ExtendPen(new Green());
        mao.print();
    }
}

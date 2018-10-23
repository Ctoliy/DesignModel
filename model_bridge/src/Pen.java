/**
 * @create 2018-10-23 14:18 by Toliy
 * @desc 毛笔沾颜色
 **/
public abstract class Pen {
    Color color;

    public Pen(Color color) {
        this.color = color;
    }

    protected void print() {
        color.draw();
    }
}

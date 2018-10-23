/**
 * @create 2018-10-18 10:13 by Toliy
 * @desc
 **/
public class Main {

    /**
     * 应用场景：我的电脑接口是hdmi的，但是我显示器是dvi的，怎么将电脑连接到显示器呢？这里就需要转接头
     */
    public static void main(String[] args) {
        //1、基于类适配器模式
        //hdmi转dvi
        Dvi dvi = new Hdmi2DviOrVga();
        System.out.println("dvi" + dvi.outDvi());
        //hdmi转vga
        Vga vga = new Hdmi2DviOrVga();
        System.out.println("vga" + vga.outVga());
        //2、基于对象适配器模式
        //hdmi转dvi
        Dvi dvi1 = new Hdmi2DviOrVgas(new HdmiImpl());
        System.out.println("dvi1" + dvi1.outDvi());
        //hdmi转vga
        Vga vga1 = new Hdmi2DviOrVgas(new HdmiImpl());
        System.out.println("vga1" + vga1.outVga());
        //3、基于接口适配器模式
        //hdmi转dvi
        Dvi dvi2 = new Hdmi2DviOrVgass(new Hdmis());
        System.out.println("dvi2" + dvi2.outDvi());
        //hdmi转vga
        Vga vga2 = new Hdmi2DviOrVgass(new Hdmis());
        System.out.println("vga2" + vga2.outVga());
    }
}

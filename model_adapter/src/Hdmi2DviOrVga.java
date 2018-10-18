/**
 * @create 2018-10-18 10:31 by Toliy
 * @desc
 **/
public class Hdmi2DviOrVga extends HdmiImpl implements Dvi, Vga {

    //hdmi转dvi
    @Override
    public String outDvi() {
        return "输给dvi接口的时候我转下成hdmi,我就可以接收了！ " + outHdmi();
    }

    //hdmi转vga
    @Override
    public String outVga() {
        return "输给vga接口的时候我转下成hdmi,我就可以接收了！ " + outHdmi();
    }
}

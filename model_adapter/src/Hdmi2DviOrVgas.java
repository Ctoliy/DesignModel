/**
 * @create 2018-10-18 10:31 by Toliy
 * @desc
 **/
public class Hdmi2DviOrVgas implements Dvi, Vga {

    private HdmiImpl hdmi;

    public Hdmi2DviOrVgas(HdmiImpl hdmi) {
        this.hdmi = hdmi;
    }

    //hdmi转dvi
    @Override
    public String outDvi() {
        return "输给dvi接口的时候我转下成hdmi,我就可以接收了！ " + hdmi.outHdmi();
    }

    //hdmi转vga
    @Override
    public String outVga() {
        return "输给vga接口的时候我转下成hdmi,我就可以接收了！ " + hdmi.outHdmi();
    }
}

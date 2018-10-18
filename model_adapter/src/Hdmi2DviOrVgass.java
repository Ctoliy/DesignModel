/**
 * @create 2018-10-18 10:31 by Toliy
 * @desc
 **/
public class Hdmi2DviOrVgass implements Dvi, Vga {

    private HdmiImpls hdmiImpls;

    public Hdmi2DviOrVgass(HdmiImpls hdmiImpls) {
        this.hdmiImpls = hdmiImpls;
    }

    //hdmi转dvi
    @Override
    public String outDvi() {
        return "输给dvi接口的时候我转下成hdmi,我就可以接收了！ " + hdmiImpls.outHdmi();
    }

    //hdmi转vga
    @Override
    public String outVga() {
        return "输给vga接口的时候我转下成hdmi,我就可以接收了！ " + hdmiImpls.outHdmi();
    }
}

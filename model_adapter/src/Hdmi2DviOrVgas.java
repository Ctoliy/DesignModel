/**
 * @create 2018-10-18 10:31 by Toliy
 * @desc
 **/
public class Hdmi2DviOrVgas implements Dvi, Vga {

    private Hdmi2DviOrVga hdmi2DviOrVga;

    public Hdmi2DviOrVgas(Hdmi2DviOrVga hdmi2DviOrVga) {
        this.hdmi2DviOrVga = hdmi2DviOrVga;
    }

    //hdmi转dvi
    @Override
    public String outDvi() {
        return "输给dvi接口的时候我转下成hdmi,我就可以接收了！ " + hdmi2DviOrVga.outHdmi();
    }

    //hdmi转vga
    @Override
    public String outVga() {
        return "输给vga接口的时候我转下成hdmi,我就可以接收了！ " + hdmi2DviOrVga.outHdmi();
    }
}

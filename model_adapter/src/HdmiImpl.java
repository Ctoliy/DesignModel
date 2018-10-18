/**
 * @create 2018-10-18 10:11 by Toliy
 * @desc
 **/
public class HdmiImpl implements Hdmi {
    @Override
    public String outHdmi() {
        return "我是hdmi接口，只可以输出hdmi信号";
    }

    @Override
    public String out() {
        return null;
    }
}

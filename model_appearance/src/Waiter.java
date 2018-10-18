/**
 * @create 2018-10-18 16:49 by Toliy
 * @desc 这个就是门面类
 **/
public class Waiter {
    private Operation bug;
    private Operation trim;
    private Operation wash;
    private Operation cook;
    private Operation take;

    public Waiter() {
        bug = new Bug();
        trim = new Trim();
        wash = new Wash();
        cook = new Cook();
        take = new Take();
    }

    public void orderDishes() {
        System.out.println("----------------->点菜完成，请稍等<-----------------");
        bug.operate();
        trim.operate();
        wash.operate();
        cook.operate();
        take.operate();
    }

    public void pay() {
        System.out.println("----------------->结账，买单完成<-----------------");
    }
}

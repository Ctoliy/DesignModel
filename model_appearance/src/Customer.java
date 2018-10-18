/**
 * @create 2018-10-18 16:48 by Toliy
 * @desc
 **/
public class Customer {

    private Waiter waiter;

    public Customer(Waiter waiter) {
        this.waiter = waiter;
    }

    public void callWaiter() {
        System.out.println("招呼服务员，开始点菜");
        waiter.orderDishes();
        System.out.println("大吃大喝中....");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waiter.pay();
    }


}

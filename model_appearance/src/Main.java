/**
 * @create 2018-10-18 16:42 by Toliy
 * @desc
 **/
public class Main {

    /**
     * 应用场景：餐厅吃饭
     * 1、招呼服务员点菜（买菜、择菜、洗菜、炒菜、上菜）
     * 2、吃饭
     */
    public static void main(String[] args) {
        /**
         * waiter就是我们的门面类
         *
         * 用户根本就不用了解知道在上菜之前需要做哪些事情，流程是怎样的，只需要跟门面类进行交互即可
         *简化用户的操作，解耦
         */
        Customer customer = new Customer(new Waiter());
        customer.callWaiter();
    }
}

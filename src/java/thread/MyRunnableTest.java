package thread;

/**
*@Author: NiuYaDong
*@ClassName: MyRunnableTest
*@Description: 
*@update: 20:09 2017/4/11
*@ModifyBy： 
*/
public class MyRunnableTest {

    
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束");
    }
}

package thread;

/**
*@Author: NiuYaDong
*@ClassName: HelloThread
*@Description:
*@update: 20:06 2017/4/11
*@ModifyBy：
*/
public class HelloThread extends Thread{

    /**
     *@Author: NiuYaDong
     *@returnType: void
     *@Param: []
     *@Description:
     *@update: 20:07 2017/4/11
     */
    @Override
    public void run(){
        try {
            for (int i=0;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

package production;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
*@Author: NiuYaDong
*@ClassName: BigPlate
*@Description:
*@update: 20:12 2017/4/11
*@ModifyBy：
*/
public class BigPlate {
    private BlockingQueue<String> eggs = new ArrayBlockingQueue<String>(1);

    /**
     *@Author: NiuYaDong
     *@returnType: void
     *@Param: [egg]
     *@Description: 往队列中放入鸡蛋
     *@update: 20:12 2017/4/11
     */
    public void putEgg(String egg){

        try {
            eggs.put(egg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我放进去一个鸡蛋");
    }

    /**
     *@Author: NiuYaDong
     *@returnType: java.lang.String
     *@Param: []
     *@Description: 从队列中取出鸡蛋
     *@update: 20:12 2017/4/11
     */
    public String getEgg(){
        String egg = null;
        try {
            egg = eggs.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我拿走一个鸡蛋");
        return egg;
    }
}

package production;

/**
*@Author: NiuYaDong
*@ClassName: TakeThread
*@Description: 消费者线程
*@update: 20:13 2017/4/11
*@ModifyBy：
*/
public class TakeThread implements Runnable{
    private BigPlate bigPlate;

    public TakeThread(BigPlate bigPlate) {
        this.bigPlate = bigPlate;
    }

    /**
     *@Author: NiuYaDong
     *@returnType: void
     *@Param: []
     *@Description: 消费者消耗鸡蛋
     *@update: 20:14 2017/4/11
     */
    public void run() {
        while(true){
            bigPlate.getEgg();
        }

    }
}

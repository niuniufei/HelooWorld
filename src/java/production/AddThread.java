package production;

/**
*@Author: NiuYaDong
*@ClassName: AddThread
*@Description:
*@update: 20:10 2017/4/11
*@ModifyBy：
*/
public class AddThread implements Runnable{
    private BigPlate plate;
    private String egg = new String("我是一个鸡蛋");

    public AddThread(BigPlate plate) {
        this.plate = plate;
    }

    /**
     *@Author: NiuYaDong
     *@returnType: void
     *@Param: []
     *@Description: 生产者持续往盘子里放入鸡蛋
     *@update: 20:10 2017/4/11
     */
    public void run() {

        while(true){
            plate.putEgg(egg);
        }
    }
}

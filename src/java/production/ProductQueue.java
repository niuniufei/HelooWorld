package production;

/**
*@date:2017/4/11
*@author:niuyadong
*@classname:ProductQueue
*/
public class ProductQueue {
    /**
     *@Author: NiuYaDong
     *@returnType: void
     *@Param: [args]
     *@Description:
     *@update: 20:10 2017/4/11
     */
    public static void main(String[] args){
        BigPlate plate = new BigPlate();
        new Thread(new AddThread(plate)).start();
        new Thread(new TakeThread(plate)).start();
    }
}




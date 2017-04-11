package thread;

/**
 * Created by Administrator on 2017/4/6.
 */
public class HelloThreadTest {

    public static void main(String[] args){
        testThread();
    }

    /**
     *@Author: NiuYaDong
     *@returnType: void
     *@Param: []
     *@Description:
     *@update: 20:09 2017/4/11
     */
    private static void testThread(){

   /*     //运行结束
        //MyThread
        //运行结果与代码的顺序并没有关系
       *//* 多次调用start()方法会出现这样的异常(IllegalThreadStateException  if the thread was already started.(如果线程已经被启动))
       Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.start(Thread.java:705)
        at thread.HelloThreadTest.main(HelloThreadTest.java:14)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)*//*
        HelloThread thread = new HelloThread();
        thread.start();
        System.out.println("运行结束");
        */
        try {
            HelloThread thread = new HelloThread();
            thread.setName("thread");
            thread.start();//通知线程规划器，该线程已经准备就绪（让系统安排一个时间是线程得到运行）所以线程启动的顺序和线程start（）的顺序没有关系
            for(int i=0;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

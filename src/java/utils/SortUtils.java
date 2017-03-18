package utils;

import java.util.List;
import java.util.Random;

/**
 * Created by niuniu on 2017/3/17.
 */
public class SortUtils {

    /**
     * 交换两个值
     * @param arr
     * @param i
     * @param j
     */
    public static <T> void swap(List<T> arr, int i, int j){
        T temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }

    /**
     * 获取随机数
     * @param n
     * @return
     */
    public static int[] produceArray(int n){
        int[] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] =(int)(Math.random()*n);
            System.out.print(array[i]+",");
        }
        System.out.println();
        return array;
    }

    /**
     * 根据泛型比较，取小
     * @param arrI
     * @param arrJ
     * @param <T>
     * @return
     */
    public static <T> Boolean less(T arrI,T arrJ){
        if(arrI instanceof String && arrJ instanceof String){
            int i = String.valueOf(arrI).compareTo(String.valueOf(arrJ));
            if(i<0){
                return true;
            }
        }else if(arrI instanceof Integer && arrJ instanceof Integer){
            Integer i = (Integer) arrI -(Integer) arrJ;
            if(i<0){
                return true;
            }
        }
        else if(arrI instanceof Double && arrJ instanceof Double){
            Double i = (Double) arrI -(Double) arrJ;
            if(i<0){
                return true;
            }
        }


        return false;
    }

    /**
     *
     * 根据泛型比较取大
     * @param arrI
     * @param arrJ
     * @param <T>
     * @return
     */
    public static <T> Boolean greater(T arrI,T arrJ){
        if(arrI instanceof String && arrJ instanceof String){
            int i = String.valueOf(arrI).compareTo(String.valueOf(arrJ));
            if(i>0){
                return true;
            }
        }else if(arrI instanceof Integer && arrJ instanceof Integer){
            Integer i = (Integer) arrI -(Integer) arrJ;
            if(i>0){
                return true;
            }
        }else if(arrI instanceof Double && arrJ instanceof Double){
            Double i = (Double) arrI -(Double) arrJ;
            if(i>0){
                return true;
            }
        }
        return false;
    }
}

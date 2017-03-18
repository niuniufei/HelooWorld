package sort.impl;

import sort.SortUtilInter;
import utils.SortUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by niuniu on 2017/3/17.
 */
public class SortUtilInterImpl implements SortUtilInter{

    /**
     * 选择排序实现
     * @param arr 需要进行排序的数组
     * @param type 正序排列还是倒序排列 type=:desc 倒序排列，默认正序排列
     */
    @Override
    public <T> void selectionSort(List<T> arr, String type) {
        int arrSize = arr.size();
        for (int i=0;i<arrSize;i++){
            if(type.equals("desc")){
                //寻找【i,n)区间里的最小值
                int maxIndex = i;
                for(int j=i+1;j<arrSize;j++){
                    if(SortUtils.greater(arr.get(j),arr.get(maxIndex))){
                        maxIndex = j;
                    }
                }
                SortUtils.swap(arr,i,maxIndex);
            }else{
                //寻找【i,n)区间里的最小值
                int minIndex = i;
                for(int j=i+1;j<arrSize;j++){
                    if(SortUtils.less(arr.get(j),arr.get(minIndex))){
                        minIndex = j;
                    }
                }
                SortUtils.swap(arr,i,minIndex);
            }

        }
    }

    /**
     * 插入排序
     * @param arr
     * @param type
     */
    @Override
    public <T> void insertionSort(List<T> arr, String type) {
        int arrSize = arr.size();
        for(int i=1;i<arrSize;i++){
//            给第j个值寻找合适的位置
            if(type.equals("desc")){
                for(int j = i;j>0;j--){
                    if(SortUtils.greater(arr.get(j),arr.get(j-1))){
                        SortUtils.swap(arr,j,j-1);
                    }else{
                        break;
                    }
                }
            }else{
                for(int j = i;j>0;j--){
                    if(SortUtils.less(arr.get(j),arr.get(j-1))){
                        SortUtils.swap(arr,j,j-1);
                    }else{
                        break;
                    }
                }
            }

        }
    }

    public static void main(String[] args){
        int[] array = SortUtils.produceArray(10000);
        List<Integer> list = new ArrayList<Integer>();
        for (int item : array){
            list.add(item);
        }
        List<Integer> list1 = new ArrayList<Integer>();
        for (int item : array){
            list1.add(item);
        }
        SortUtilInter sortUtilInter = new SortUtilInterImpl();
        testTimeSort(sortUtilInter.getClass(),"selectionSort",list,"desc");
        testTimeSort(sortUtilInter.getClass(),"insertionSort",list1,"desc");
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i)+",");

        }
        System.out.println();
        for (int i =0;i<list1.size();i++){
            System.out.print(list1.get(i)+",");
        }
        System.out.println();
    }

    /**
     * 测试排序性能
     * @param sortUtilInter
     * @param method
     * @param list
     * @param typeSort
     */
    private static void testTimeSort(Class sortUtilInter,String method,List list,String typeSort){
        try {
            SortUtilInter sortUtilInter1 = (SortUtilInter) sortUtilInter.newInstance();
            Method method1 = sortUtilInter.getMethod(method,List.class,String.class);
            long beginTime = new Date().getTime();
            System.out.println("startTime="+beginTime);
            method1.invoke(sortUtilInter1,new Object[]{list,typeSort});
            long endTime = new Date().getTime();
            System.out.println("endTime="+endTime);
            System.out.println("useTime="+(endTime - beginTime));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}

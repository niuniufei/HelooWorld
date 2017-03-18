package sort;

import java.util.List;

/**
 * Created by niuniu on 2017/3/16.
 */
public interface SortUtilInter {

    /**
     * 选择排序
     * @param arr
     * @param type
     * @param <T>
     */
    <T> void selectionSort(List<T> arr, String type);

    /**
     * 插入排序
     * @param arr
     * @param type
     * @param <T>
     */
    <T> void insertionSort(List<T> arr, String type);
}

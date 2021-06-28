package list;

/*
 * @Date: 2021-06-28 13:08:38
 * @Author: winterchen
 * @Description: 数组排序
 * @Version: 1.0
 * @LastEditTime: 2021-06-28 15:03:01
 */
public class ArraySort {
    

    /**
     * 冒泡排序
     * 最佳情况：t[n] = O[n], 最差情况：t[n] = O[n²], 平均：t[n] = O[n²]
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序
     * 最稳定的排序：t[n] = O[n²]
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if(array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void print(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("array is null");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}


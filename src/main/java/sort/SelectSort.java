package sort;

public class SelectSort extends BaseSort {

    public static void main(String[] args) {
        SelectSort sort = new SelectSort();
        sort.print();
    }

    public String name() {
        return "选择排序";
    }

    /**
     * 基本思想
     * 第一次从 array[0] ~ array[n-1] 中选取最小值，与array[0]交换
     * 第二次从 array[1] ~ array[n-1] 中选取最小值，与array[1]交换
     * 第三次次从 array[2] ~ array[n-1] 中选取最小值，与array[2]交换
     * ...
     * 总共通过 n-1 次 得到一个按排序排列的有序数列
     */
    public void SelectSort(int[] array) {
        sort(array);
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int index = i + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minIndex = index;
                    minValue = array[index];
                }
            }
            array[minIndex] = array[i];
            array[i] = minValue;
        }
    }
}

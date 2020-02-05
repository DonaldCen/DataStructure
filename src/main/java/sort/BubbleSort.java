package sort;

public class BubbleSort extends BaseSort {

    public void sort(int[] array) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    flag = true;
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }

    public String name() {
        return "冒泡排序";
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.print();
    }

    /**
     * 冒泡排序时间复杂度 O(n^2)
     * 基本思想
     * 通过对 待排序序列 从前向后（下标较小的元素开始），依次比较相邻
     * 的元素的值，若发现 逆序 则交换，使值较大的元素逐渐从前向后移动，
     * 像水底下的气泡一样逐渐向上冒
     */
    public void BubbleSort(int[] array) {
        sort(array);
    }
}

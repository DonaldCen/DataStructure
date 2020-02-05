package sort;

public class InsertSort extends BaseSort {
    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        sort.print();
    }

    /**
     * 基本思想
     *  把 n 个待排序的元素看成为一个有序表和一个无序表
     *  开始时有序表只包含一个元素，无序表中包含n-1个元素
     *  排序过程中每次从无序表中取出第一个元素，
     *  把它们的排序码依次与有序表的排序码进行比较
     *  将它们插入到有序表中的适当位置，使之成为新的有序表
     */
    public void sort(int[] array) {
        //第一个认为是已经有序的，所以从第二个开始
        for(int index = 1;index<array.length;index++){
            //用一个变量记录需要插入的值，用于后面恢复数据使用
            int insertValue = array[index];
            int insertIndex = index - 1 ;
            //移位操作常用做法
            while (insertIndex >= 0 && insertValue < array[insertIndex] ){
                array[insertIndex+1] = array[insertIndex];
                insertIndex --;
            }
            /**
             * 用来恢复数据，所谓的移位，就修改两边的值，
             * 记录后面数值，然后前头一个数值赋值给后面，然后再用后面的值赋给前面
             */
            array[insertIndex+1] = insertValue;
        }
    }

    public void  InsertSort(int[] array){
        sort(array);
    }

    public String name() {
        return "插入排序";
    }
}

package find;

/**
 * @Description 二分查找
 * @Author <a href="mailto:cenyingqiang@wxchina.com">yingqiang.Cen</a>
 * @Date 2020/2/20
 * @Version 1.0.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,23,44,666,777};
        int index = binarySearch(arr,0,arr.length-1,777);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr,int left,int right,int findValue){
        System.out.println("binarySearch~~");
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) * 1 / 2;
        int midValue = arr[mid];
        if(findValue > midValue){
            return binarySearch(arr,mid+1,right,findValue);
        }else if(findValue < midValue){
            return binarySearch(arr,left,mid-1,findValue);
        }else {
            return mid;
        }
    }
}

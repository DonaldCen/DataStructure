package find;

/**
 * @Description
 * @Author <a href="mailto:cenyingqiang@wxchina.com">yingqiang.Cen</a>
 * @Date 2020/2/20
 * @Version 1.0.0
 */
public class InsertSearch {
    public static void main(String[] args) {
        int[] arr = {1,23,44,666,777};
        int index = InsertSearch(arr,0,arr.length-1,888);
        System.out.println(index);
    }

    public static int InsertSearch(int[] arr,int left,int right,int findValue){
        System.out.println("InsertSearch~~");
        if(left > right || findValue < arr[left] || findValue > arr[right]){
            return -1;
        }
        int mid = left + (right - left) * (findValue - arr[left]) / (arr[right] - arr[left]);
        int midValue = arr[mid];

        if(findValue > midValue){
            return InsertSearch(arr,mid + 1,right,findValue);
        } else if(findValue < midValue){
            return InsertSearch(arr,left,mid-1,findValue);
        }else {
            return mid;
        }

    }
}

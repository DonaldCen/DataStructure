package find;

/**
 * @Description 线性查找
 * @Author <a href="mailto:cenyingqiang@wxchina.com">yingqiang.Cen</a>
 * @Date 2020/2/20
 * @Version 1.0.0
 */
public class LineSearch {

    public static void main(String[] args) {
        int[] arr = {1,23,44,666,777};
        int index = lineSearch(arr,222);
        System.out.println(index);
    }

    public static int lineSearch(int[] arr,int findValue) {
        for (int index = 0; index < arr.length; index++) {
            if(findValue == arr[index]){
                return index;
            }
        }
        return -1;
    }
}

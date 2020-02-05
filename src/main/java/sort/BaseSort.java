package sort;

import java.util.Arrays;

public abstract class BaseSort {
    public static final int[] array = {1, 333, -7, 888, 9, 6, 22, 888, 33, 22};

    public void print() {
        System.out.println(name() + "前");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(name() + "后");
        System.out.println(Arrays.toString(array));
    }

    public abstract void sort(int[] array);

    public abstract String name();
}

package codingTask2;

public final class SwapAlgorithm {
    public static <T> void swap(T[]a,int i,int j) {
//        T[]arr = new T[10];
        System.out.println(a[i]+" "+a[j]);
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        System.out.println(a[i]+" "+a[j]);
    }

    public static void main(String[] args) {
        Integer[]array = new Integer[10];
        array[0]=10;
        array[1]=20;
        swap(array,0,1);
    }
}

public class InsertionSort {
    static int[] list = {10,34,251,54,-1,0,9,10,99,63,111};
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length ; i++) {
            int currentElement = list[i];
            int k;
            for ( k = i-1; k >=0 && list[k] > currentElement ; k--) {
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int e : list
             ) {
            System.out.print(e + "\t");
        }
    }
}


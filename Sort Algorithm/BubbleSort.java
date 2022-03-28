class BubbleSort{

    static void bubbleSort(int[] array){
        boolean isSorted =  false;
        int lastUnSorted = array.length-1;

        while(!isSorted){
            isSorted= true;
            for(int i=0; i < lastUnSorted; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1); isSorted=false;
                }
            }
            lastUnSorted--;
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String argsp[]){
        int[] arr= new int[]{2,5,7,87,2,4,34,12,34};
        bubbleSort(arr);
        for(int x: arr) System.out.println(x);
    }
}
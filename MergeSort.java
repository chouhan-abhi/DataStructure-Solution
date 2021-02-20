public class MergeSort {

    public static void sort(int [] array, int left, int right){
         if(left<right){
            int mid=(left+right)/2;
            sort(array, left, mid);
            sort(array, mid+1, right);
            merge(array, left, right, mid);
         }
    }

    public static void merge(int[] array, int left, int right, int mid){
        int size1 = mid-left+1;
        int size2 = right-mid;

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for(int i=0; i<size1; ++i) arr1[i]=array[left+i];
        for(int i=0; i<size2; ++i) arr2[i]=array[mid+i+1];

        int i=0, j=0, k=left;
        while(i<size1 && j<size2){
            if(arr1[i]<=arr2[j]){
                array[k]=arr1[i]; i++;
            }else{
                array[k]=arr2[j]; j++;  }
            k++;
        }

        while(i<size1){
            array[k]=arr1[i]; i++; k++;
        }
        
        while(j<size2){
            array[k]=arr2[j]; j++; k++;
        }
    }
    public static void main(String args[]){        
        int[] arr = new int[] { 56, 5, 3, 10, 2, 6, 23, 8, 9, 10 };
        sort(arr, 0, arr.length-1);
        
        for(int x: arr)  System.out.println(x);
    }
}

public class Main
{
    public static int BS(int[] arr, int x, int left, int right){
        if(left>right) return -1;
        int mid=(left+right)/2;
        if(arr[mid]==x) return mid;
        else if(x<arr[mid]) return BS(arr, x, left, mid-1);
        else return BS(arr, x, mid+1, right);
    }
	public static void main(String[] args) {
		int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println(BS(arr, 11, 0, arr.length-1));
	}
}

public class BinarySearch {
    public static int BS_Iterative(int[] arr, int x) {
        int left = 0, right = arr.length - 1, mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static int BS_recursion(int[] arr, int x, int left, int right) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == x)
            return mid;
        else if (x < arr[mid])
            return BS_recursion(arr, x, left, mid - 1);
        else
            return BS_recursion(arr, x, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(BS_recursion(arr, 8, 0, arr.length - 1));
        System.out.println(BS_Iterative(arr, 9));
    }
}

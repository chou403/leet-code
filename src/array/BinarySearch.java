package array;

/**
 * {@code @author} JSY
 * {@code @date} 2023/2/1
 * {@code @className} BinarySearch
 * {@code @description} leetcode 704 二分查找
 * <p>
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例2:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 * <p>
 * 提示：
 * <p>
 * 你可以假设 nums中的所有元素是不重复的。
 * n将在[1, 10000]之间。
 * nums的每个元素都将在[-9999, 9999]之间。
 */
public class BinarySearch {
    /**
     * 循环迭代
     */
//    public int search(int[] nums, int target) {
//        int start = 0, end = nums.length - 1;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (target > nums[mid]) {
//                start = mid + 1;
//            } else if (target < nums[mid]) {
//                return mid;
//            }
//        }
//        return -1;
//    }

    /**
     * 递归
     */
    public int search(int[] nums, int target) {
        return searchNums(nums, 0, nums.length - 1, target);
    }

    public int searchNums(int[] arr, int start, int end, int key) {
        int mid = (start + end) / 2;
        if (start <= end) {
            if (key > arr[mid]) {
                return searchNums(arr, mid + 1, end, key);
            } else if (key < arr[mid]) {
                return searchNums(arr, start, end - 1, key);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public void fun(int[] a, int n, int k) {
        int i;
        if (k == n - 1) {
            for (i = 0; i < n; i++) {
                //执行n次
                System.out.println(a[i]);
            }
        } else {
            for (i = k; i < n; i++) {
                //执行n-k次
                a[i] = a[i] + i * i;
            }
            fun(a, n, k + 1);
        }
    }
}

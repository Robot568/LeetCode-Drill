package ArrayDemo;

public class BinarySearch
{
        //二分查找法
    public static int search(int[] nums, int target){
            int left = 0, right = nums.length;
            while(left < right){
                int mid = left + ((right - left)>>1);
                if(nums[mid] == target){
                    return mid;
                }else if (nums[mid] < target){
                    left = mid+1;
                }else{
                    right = mid;
                }

            }
            //未找到目标值
            return -1;
        }
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,5,6,7,8,9};
        int target=3;
      int result=search(nums,target);//调用二分查找法
        System.out.println("Target found at index: " + result);
    }
}

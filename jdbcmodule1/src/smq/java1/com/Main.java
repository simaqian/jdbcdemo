package smq.java1.com;

public class Main{
    public static void main(String[] args){
        int [] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(new Main().search(nums, 0));

psvm
    }

    public static void main(String[] args) {

    }
    private static final
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start <= end){
            for (int num : nums) {

            }
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];

            }


            mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < nums[start]){
                if(target < nums[start]){
                    start = mid;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target < nums[mid]){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
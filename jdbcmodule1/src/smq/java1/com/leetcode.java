package smq.java1.com;

public static void main(String[]args){

        }
        }
public class leetcode {
    public static void main(String[] args) {
//        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
       // int[][] matrix  = {{-1,3}};
        //System.out.println(new leetcode().findNumberIn2DArray(matrix, 1));

        String st1 = "abc";
        String   st2  ="bc";
        String st3 = st1 + st2;
        String  st4 = "abc" + "bc";
        System.out.println(st3 == st4);
    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix ==null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int n = matrix.length;
        int m = matrix[0].length;
        boolean ans = false;
        int left = 0;
        int right = n;
        int mid = -1;
        while(left < right){
            mid = (left + right)/2;
            if(matrix[mid][0] < target){
                left = mid + 1;
            }else if(matrix[mid][0] == target){
                return true;
            }else{
                right = mid;
            }

        }
        int L1 = left - 1;
        if(L1 < 0)
            return false;
        for(int i = 0; i <= L1; i++){
            if(ans = getNumber(target, matrix[i]))
                return true;
        }
        return false;

    }
    public boolean getNumber(int target, int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        while(left < right){
            mid = (left + right)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] == target){
                return true;
            }else{
                right = mid;
            }
        }
        return target == nums[left];
    }
}

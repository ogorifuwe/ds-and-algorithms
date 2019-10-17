/**.
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side os equal to the sum of the num-
 * bers on the other side.
 *
 * canBalance([1, 1, 1, 2, 1]) --:~ true
 * canBalance([2, 1, 1, 2, 1]) --:~ false
 * canBalance([10, 10]) --:~ true
 **/
public class CanBalance {

    public static boolean canBalance1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
        }
        if (!(sum % 2 == 0))
            return false;
        
        return true;
    }

    public static boolean canBalance2(int[] nums) {
        int sumLHS = 0;
        for (int i = 0; i < nums.length; ++i) {
            sumLHS += nums[i];
            int sumRHS = 0;
            for (int j = nums.length-1; j > i; --j) {
                sumRHS += nums[j];
            }
            if (sumLHS == sumRHS) {
                return true;
            }
        }
        return false;
    }

    public static boolean canBalance3(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            int sum = 0;
            for (int j = 0; j < i; ++j) {
                sum += nums[j];
            }

            for (int j = i; j < nums.length; ++j) {
                sum -= nums[j];
            }

            if (sum == 0) { return true; }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1, 2};
        boolean canBalance = canBalance3(nums);
        System.out.print(canBalance + "\n");
    }
    
} 

package leetcode.medium;

//https://leetcode.com/problems/jump-game/
public class JumpGame {
    public static void main(String[] args) {
        int[] data = {3, 2, 1, 0, 4};
        System.out.println(canJump(data));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxLength >= i) {
                maxLength = Math.max(maxLength, nums[i]);
            } else {
                break;
            }
        }
        return maxLength >= nums.length - 1;
    }

    public static boolean canJumpRecurssionSolution(int[] nums) {
        if (nums.length == 1) return true;
        return canJumpRecurssionSolutionUtil(nums, 0);
    }

    private static boolean canJumpRecurssionSolutionUtil(int[] nums, int current) {
        if (current < 0 || current >= nums.length || nums[current] < 0) return false;
        int temp = nums[current];
        nums[current] = -nums[current];
        if (current == nums.length - 1) return true;
        for (int step = temp; step > 0; step--) {
            if (canJumpRecurssionSolutionUtil(nums, current + step)) return true;
        }
        return false;
    }
}


public class UniqueFinder {
    public int unique(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        return unique;
    }
    public static void main(String[] args) {
        UniqueFinder obj = new UniqueFinder();
        int[] nums = {2, 3, 5, 3, 2};
        int result = obj.unique(nums);
        System.out.println("The unique element is: " + result);
    }
}
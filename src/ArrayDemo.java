class ArrayDemo {
    public static void main(String[] args) {
        // 1D Array
        int[] nums = {10, 20, 30};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

        // 2D Array
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

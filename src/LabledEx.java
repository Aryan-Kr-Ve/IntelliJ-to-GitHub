public class LabledEx {
    public static void main(String[] args) {
            outer: // label
            for (int i = 1; i<3; i++) {
                for (int j = 1; j <= 3; j++) {
                    if (i == 2 && j == 2) {
                        break outer; // exits both loops
                    }
                    System.out.println(i + " " + j);
                }
            }
        }
    }

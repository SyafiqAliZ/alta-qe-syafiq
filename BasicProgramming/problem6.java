package BasicProgramming;

public class problem6 {
    private static void drawXYZ(int N) {
    //Problem 6 - Draw XYZ

        for (int i = 1; i <= N * N; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
            } else if (i % 2 != 0) {
                System.out.print("Y ");
            } else {
                System.out.print("Z ");
            }
            if (i % N == 0) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        drawXYZ(5);
    }
}

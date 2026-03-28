public class Triangle {
    public static void main(String[] args) {

        int height = 3;

        for (int i = 1; i <= height; i++) {

            int stars = 2 * i - 1; // 1, 3, 5...

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
                if (j < stars) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

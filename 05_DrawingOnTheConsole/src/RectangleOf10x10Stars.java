public class RectangleOf10x10Stars {
    public static void main(String[] args) {
        char star = '*';
        int iterations = 10;

        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < iterations; j++) {
                System.out.print(star);
            }
            System.out.println();
            //System.out.println(new String());
        }
    }
}

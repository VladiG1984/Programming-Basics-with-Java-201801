import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plantName = scanner.nextLine();

        boolean isFruit = plantName.equals("banana") || plantName.equals("kiwi") ||
                            plantName.equals("apple") || plantName.equals("cherry") ||
                            plantName.equals("cherry") || plantName.equals("lemon") ||
                            plantName.equals("grapes");
        boolean isVegetable = plantName.equals("tomato") || plantName.equals("cucumber") || plantName.equals("pepper") ||
                plantName.equals("carrot");

        if (isFruit) {
            System.out.println("fruit");
        } else if (isVegetable) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        String animalType = "unknown";

        switch(animal) {
            case "dog":
                animalType = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                animalType = "reptile";
                break;
//            case "others":
//                animalType = "unknown";
//                break;
        }
        System.out.println(animalType);
    }
}

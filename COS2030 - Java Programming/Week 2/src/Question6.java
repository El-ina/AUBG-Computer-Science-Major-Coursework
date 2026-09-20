import java.util.Scanner;

public class Question6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        int zodiacDeterminer = year % 12;
        String animal = switch (zodiacDeterminer){
          case 0 -> "Monkey";
          case 1 -> "Rooster";
          case 2 -> "Dog";
          case 3 -> "Pig";
          case 4 -> "Rat";
          case 5 -> "Ox";
          case 6 -> "Tiger";
          case 7 -> "Rabbit";
          case 8 -> "Dragon";
          case 9 -> "Snake";
          case 10-> "Horse";
          case 11 -> "Sheep";
          default -> "noop";
        };

        System.out.println(animal);

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine().trim());

        if (count < 0 ) {
            System.out.println("Seriously? Why so negative?");
        } else if (count == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            List<String> names = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                names.add(scanner.nextLine().trim());
            }

            for (String name : names) {
                System.out.println("Hello, " + name);
            }
        }

        scanner.close();
    }
}

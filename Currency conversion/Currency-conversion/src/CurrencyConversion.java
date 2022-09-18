import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd;
        double usd;
        double rate = 23000;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1.USD convert to VND :");
            System.out.println("2.VND convert to USD :");
            System.out.println("0.Exit");
            System.out.println("Enter your choice :");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter your USD :");
                    usd = scanner.nextDouble();
                    System.out.println(" Giá trị bằng VND :" + usd*23000);
                    break;
                }

                case 2: {
                    System.out.println("Enter your VND :");
                    vnd = scanner.nextDouble();
                    System.out.println("Giá trị bằng USD :" + vnd/23000);
                    break;
                }

                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}

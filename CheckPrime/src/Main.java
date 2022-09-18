public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = scanner.nextInt();
        boolean check = true;

        for (  int i = 2;  i < number; i++) {
            for (int j = 2 ; j <= Math.sqrt(i); j++) {
                if ( i % j == 0) {
                    check = false;
                } else {
                    check = true;
                }
            }
            if(check ) {
                System.out.println(i + "is a prime");
            } else {
                System.out.println( i + "is not a prime");
            }
        }

    }
}

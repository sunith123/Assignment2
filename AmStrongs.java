public class AmStrongs {
    public static void main(String[] args) {
        int sum = 0;
        int temp;
        int number;
        System.out.println("Amstrong number btw 100-999 are :");
        for (int i = 100; i <= 999; i++) {
            number = i;
            while (number > 0) {

                temp = number % 10;
                sum = sum + (temp * temp * temp);
                number = number / 10;
            }
            if (sum == i) {
                System.out.println(i+ " is AmStrong Number ");
            }
            sum=0;
        }
    }
}

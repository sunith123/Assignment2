public class FindElementInArray {
        public static void main(String[] args) {
            int[] num = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
            int toFind = 19;
            int flag=0;

            for (int n : num) {
                if (n == toFind) {
                    flag=1;
                    break;
                }
            }

            if(flag==1)
                System.out.println(toFind + " is found.");
            else
                System.out.println(toFind + " is not found.");
        }
    }


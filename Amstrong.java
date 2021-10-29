class Amstrong{
    public static void main(String[] args) {
     System.out.println("Enter a number to check ArmStrong Or Not: ");
        int sum=0;
        int temp;
        int number=153;
        int a=153;
        while (a!=0) {
            temp=a%10;
            sum=sum+(temp*temp*temp);
            a=a/10;
        }
        if (sum==number) {
            System.out.println(number+" is ArmStrong Number ");
        }
        else {
            System.out.println(number + "is not ArmStrong Number ");
        }
    }
  }
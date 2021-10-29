import java.util.Scanner;

public class Mark
{
	
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		int arr[][] = new int[10][10];
		int sum=0;
		int n=1;
		System.out.println("Enter marks of first stud,second stud,third stud");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
	
			System.out.println("Total mark and Average");

	
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
			sum=sum+arr[i][j];
			if(j==2)
			{
				System.out.println("Total marks of stud :" + n + " is "+sum +" Average:"+ (sum/3));
				sum=0;
				n++;
			}
			}
		}	
	sum=0;
	n=1;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
		{
				sum=sum+arr[j][i];
				if(j==2)
			{
			System.out.println("Total marksof subject "+ n + " is "+sum +" Average:"+(sum/3));
			sum=0;
			n++;
			}
		}
		}
	
	}

}
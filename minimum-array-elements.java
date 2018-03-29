import java.util.*;
public class Elements {
	static int n1,n2;
	public static void main(String[] args) {
		int sum,n;
		Scanner sc=new Scanner(System.in);
		int k=1;
		//It is multiple time code run to used it
		do {
			System.out.println("Enter The How many elements you wants");
			n=sc.nextInt();
			// Declaration of Array
			int arr[]=new int[n];
			System.out.println("Enter Array Elments");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter Required sum");
			sum=sc.nextInt();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					//it is array value addition and check that addtion value is equal or not of sum
					if(arr[i]+arr[j]==sum) {
						n1=arr[i];
						n2=arr[j];
					}
				}
			}
			System.out.println("Required Sum="+sum);
			System.out.println("Pair found= "+n2+" "+n1);
		}
		while(k<=2);
	}
}

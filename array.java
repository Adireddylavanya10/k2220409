import java.util.scanner;
class insert array 
{
	public static void main(String[] args) 
	{
		int n,pos,x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of elements you want in array:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the array elements are:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("enter the position where you want to insert element:");
		pos=s.nextInt();
		System.out.print("enter the element you want to insert:");
		x=s.nextInt();
		for(int i=n-1;i>=pos-1;i--)
		{
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("after inserting:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
	}
}
}

package arrayPractise;

public class A8_DuplicateElement {

	public static void main(String[] args) {
		int arr[]= { 50, 70, 80, 30, 90, 20, 80, 70, 80, 70 };
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
					cnt++;
				}
			}
			
		}
		System.out.println();
		System.out.println(cnt);

	}

}

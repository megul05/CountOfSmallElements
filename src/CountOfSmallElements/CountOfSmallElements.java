package CountOfSmallElements;

import java.util.*;

public class CountOfSmallElements {
	
	public static int[] smallnumber(int[] arr)
	{
		
		int res[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
			res[i] = count;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		int result[] = smallnumber(arr);
		for(int i=0;i<size;i++)
		{
			System.out.println(result[i]);
		}

	}

}

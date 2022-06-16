package week1.day2;

public class PrintDuplicates {

	public static void main(String[] args) {
		int []arr ={8,4,45,23,98,23,0,7};
		System.out.println("Length of the array:  " + arr.length);
		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length;j++)
		
	
		if (arr[i]==arr[j])
		{
			System.out.println(arr[i]);
		}
		}
	}
}




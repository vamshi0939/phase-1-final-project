package assignment;
public class arrays 
{
	public static void main(String[] args)
	{
		System.out.println("--------1-D ARRAY--------");
	{
	 int[] number = new int[10];
	number[0] = 1;
	number[1] = 2;
	number[2] = 3;
	number[3] = 4; 
	number[4] = 5;
	number[5] = 6;
	number[6] = 7;
	number[7] = 8;
	number[8] = 9;
	number[9] = 10;
	 for(int i = 0; i < number.length; i++)
	System.out.println("number["+i+"]"+ number[i]);	 
System.out.println("\n");
System.out.println("-----2-D ARRAY---------");
int arr [] []= { { 1, 2 } , { 3, 4 } };
for (int i = 0; i < 2; i++)
for (int j = 0; j < 2; j++)
System.out.println("arr[" + i + "][" + j + "] ="+arr[i][j]);
}
	}}

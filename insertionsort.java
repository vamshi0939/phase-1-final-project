package assisted;

public class insertionsort {
	public static  void main(String[] args){

        int[] arr = {55,336,51,87,36,49,23};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }
     }
    public static void insertionSort(int[] arr){

    int len = arr.length;
    for(int j=1;j<len;j++){
    int key = arr[j];
    int i=j-1;
    while ((i>-1) && (arr[i]>key)){

        arr[i+1]=arr[i];
        i--;
    }
    arr[i+1]=key;
         }

    }
}



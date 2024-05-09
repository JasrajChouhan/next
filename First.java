import java.util.Arrays;
public class First {
    public static void insertionSort (int[] arr) {
        // add your logic here
        int j=0,temp=0;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int a[] = {2,1,4,-9,50 , 34 , 56 ,56 , 89 ,90} ;
        insertionSort(a);
    }
}
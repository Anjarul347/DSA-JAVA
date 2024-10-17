public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};
        int temp;

        System.out.println("\nThe given array is:-\n");

        for(int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }


        //Sorting logic of Bubble sort

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("After sorting the array is:-\n");

        for(int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }




    }
}

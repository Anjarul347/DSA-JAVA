public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};
        // int arr[] = {12, 11, 13, 5, 6};

        System.out.println("\nThe given array is:-\n");

        for(int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }


        //Sorting logic of Insertion  sort

        for(int i = 1; i < arr.length; i++){

            int current = arr[i];
            int j = i-1;

            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1]=current;
            
            
        }

        System.out.println("\nAfter sorting the array is:-\n");

        for(int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

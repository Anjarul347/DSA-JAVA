public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};
        int minIndex;
        int temp;

        System.out.println("\nThe given array is:-\n");

        for(int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }


        //Sorting logic of Selection sort

        for(int i = 0; i < arr.length-1; i++){

            minIndex = i;
            for(int j = i+1; j <arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                
            }
            if(minIndex!=i){
                    temp = arr[minIndex];
                    arr[minIndex]= arr[i];
                    arr[i] = temp;
                }
            
            
        }

        System.out.println("\nAfter sorting the array is:-\n");

        for(int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

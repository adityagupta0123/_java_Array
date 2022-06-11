//create building of arr element size
class solution {
    public static void main(String[] args) {
        int arr[] = {3,6,1,2,2,5};
        int max = arr[0];
        for(int x: arr){
            if(x > max)
              max = x;
        }
        for(int floor = max; floor > 0; floor--){
            for(int i = 0; i< arr.length; i++){
                if(arr[i] >= floor)
                  System.out.print("*\t");
                else
                  System.out.print("\t");
            }
            System.out.println();
        }
        
    }
    
}

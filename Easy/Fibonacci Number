class Solution {
    public int fib(int n) {
    //----------------------------------------------------------------------------------------------------------//
        //the below code has the time complexity of O(2^n)
      
        /* if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1) + fib (n-2); */
        
        //the below code has the time complexity of O(n)
        /*int arr[] = new int[n+1];
        
        for(int i = 0; i<=n;i++){
            if(i==0){
                arr[i] = 0;
            } else if(i == 1){
                arr[i] = 1;
            } else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr[arr.length-1];*/
      //--------------------------------------------------------------------------------------------------------//  
        
        int arr[] = new int [3];
        
        for(int i=0;i<=n;i++){
            if(i==0){
                arr[0] = 0;
            } else if(i == 1){
                arr[1] = 1;
            } else {
                arr[2] = arr[0] + arr[1];
                arr[0] = arr[1];
                arr[1] = arr[2];
            }
        }
        
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        } else {
            return arr[1];
        }
    }
}

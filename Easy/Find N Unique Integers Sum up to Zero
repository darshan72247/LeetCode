class Solution {
    public int[] sumZero(int n) {
        
        int arr[] = new int[n];
        int count = 1;
        
        if(n % 2 == 1){
            arr[0] = 0;
            for(int i = 1;i<n-1;i = i+2){
                arr[i] = count;
                arr[i+1] = count * (-1);
                count += 1;
            }
        } else {
             for(int i = 0;i<n-1;i = i+2){
                arr[i] = count;
                arr[i+1] = count * (-1);
                count += 1;
            }
        }
        return arr;
        
    }
}

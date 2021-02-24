class Solution {
    public void duplicateZeros(int[] arr) {
        int duplicateArr[] = new int[arr.length];
        int pointer = 0;
        
        for(int i=0; i<arr.length && pointer<duplicateArr.length;i++){
            if(arr[i] == 0 && pointer < duplicateArr.length-1){
                duplicateArr[pointer] = 0;
                duplicateArr[pointer + 1] = 0;
                pointer += 2;
            } else {
                duplicateArr[pointer] = arr[i];
                pointer++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = duplicateArr[i];
        }
    }
}

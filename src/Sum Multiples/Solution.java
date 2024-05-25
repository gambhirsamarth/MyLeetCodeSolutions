class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]%3==0 || arr[i]%5==0 || arr[i]%7 ==0) sum+=arr[i];
        }
        
        return sum;
    }
}

class ValidMountainArray {
    public static void main(String[] args) {
        int arr[] = {0,1};
        validMountainArray(arr);
        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        
        if(arr.length<3){
           return false;
            
        }
        if(arr[0]>arr[1]){
            return false;
        }
        
        int maxIndex = 0;
        
        //0,3,4,2,1; 
        for(int j=1;j<=arr.length-1;j++){
            if(arr[j]==arr[j-1]){
                return false;
            }
            if(arr[j-1]>arr[j]){
                maxIndex=j-1;
                break;
            }
            
        }
        for(int i=maxIndex+1;i<=arr.length-1;i++){
            if(arr[i-1]<=arr[i]){
                return false;
            }
        }
        return true;
    }
}

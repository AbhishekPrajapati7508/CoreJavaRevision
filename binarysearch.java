public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=4;
       System.out.println("Target Index value is : "+search(arr,target));
        //  for(int num : arr) {
        //     System.out.print(num + " ");
        // }
    }
    public static int search(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
        while(left<=right){
             int mid=left+(right-left)/2;
             if(nums[mid]==target){
                return mid;
             }
             if(nums[mid]<target){
                left=mid+1;
             }
             else{
                right= mid-1;
             }
        }
        return -1;
       
    }
}

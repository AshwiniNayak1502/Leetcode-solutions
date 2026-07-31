class Solution {
    static int n;
    public int findKthLargest(int[] nums, int k) {
        n=nums.length;
        int nl=(nums.length/2)-1;
        for(int i=nl;i>=0;i--){
            heapify(i,nums);
        }
       return delete(k,nums);
    }

    public static void heapify(int parent,int[] nums){
        int left=2*parent+1;
        int right=2*parent+2;
        int largest=parent;

        if(left<n && nums[left]>nums[largest]){
            largest=left;
        }

        if(right<n && nums[right]>nums[largest]){
            largest=right;
        }

        if(parent!=largest){
            swap(parent,largest,nums);
            heapify(largest,nums);
        }
    }

    public static void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public static int delete(int k,int[] nums){
        int data=-1;
        while(k>0){
            data=nums[0];
            nums[0]=nums[n-1];
            n--;
            heapify(0,nums);
            k--;
        }
        return data;
    }
}

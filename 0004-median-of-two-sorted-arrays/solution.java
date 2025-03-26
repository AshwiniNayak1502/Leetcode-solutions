class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] a=new int[m+n];
        int i=0,j=0,k=0;
        int mid=(m+n)/2;
        while(i<m&&j<n)
        {
            if(nums1[i]<nums2[j])
            {
                a[k]=nums1[i];
                i++;
            }
            else
            {
                a[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            a[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n)
        {
            a[k]=nums2[j];
            k++;
            j++;
        }
        if((m+n)%2!=0)
            return a[mid];
        else
        {
            double v=(a[mid-1]+a[mid])/2.0;
            return v;
        }
        
    }
}



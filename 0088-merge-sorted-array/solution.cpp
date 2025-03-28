class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=0,j=0,k=0,temp;
        i=m;
        while(i<m+n)
        {
            nums1[i]= nums2[j];
            i++;
            j++;
        }
        for(i=0;i<m+n-1;i++)
        {
            for(j=i+1;j<m+n;j++)
            {
                if(nums1[i]>nums1[j])
                {
                    temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
};

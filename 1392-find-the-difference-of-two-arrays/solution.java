class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> l=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        for(int x:nums1) set1.add(x);
        Set<Integer> set2=new HashSet<>();
        for(int x:nums2) set2.add(x);
        ArrayList<Integer> ns1=new ArrayList<>();
        for(int x:set1){
            if(!set2.contains(x)) ns1.add(x);
        }
        ArrayList<Integer> ns2=new ArrayList<>();
        for(int x:set2){
            if(!set1.contains(x)) ns2.add(x);
        }
        l.add(ns1);
        l.add(ns2);
        return l;
    }
}

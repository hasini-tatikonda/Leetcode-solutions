class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<String> hs=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           // for(int j=i+1;j<nums.length-1;j++){
             //   for(int k=j+1;k<nums.length;k++){
                //    if(nums[i]+nums[j]+nums[k]==0){
                int j=i+1;
                int k=nums.length-1;
                while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        int a[]={
                            nums[i],nums[j],nums[k]
                        };
                        Arrays.sort(a);
                        String s=a[0]+","+","+a[1]+","+","+a[2];
                        if(!hs.contains(s)){
                            hs.add(s);
                            List<Integer> b=new ArrayList<>();
                            b.add(a[0]);
                            b.add(a[1]);
                            b.add(a[2]);
                            ans.add(b);
                        }
                        j++;
                        k--;
                    }
                    else if(sum<0){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
                        
                    }
                
        
        return ans;
    }
}
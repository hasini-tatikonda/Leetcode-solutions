class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
       
        int[] ans=new int[n];
        Deque<Integer> st=new ArrayDeque<>();
 int pr = 0;
 for (String s:logs) {
            String[] p=s.split(":");
 int id=Integer.parseInt(p[0]);
            int time=Integer.parseInt(p[2]);
            if (p[1].equals("start")) {
                if (!st.isEmpty()) {
                    ans[st.peek()]+=time-pr;
                } 
 st.push(id);
                pr=time;
            } else {
                ans[st.pop()]+=time-pr+1;
                pr=time+1;
            }
        }
return ans;
    }
}
    
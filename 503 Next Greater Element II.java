class Solution {
    public int[] nextGreaterElements(int[] nums) {
    
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> st=  new Stack<>();
        
        for(int i = 0; i < nums.length;++i){
        
            //process each node
            //try to pop all the small 
            //elements from the stack
            
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                ans[st.peek()] = nums[i];
                st.pop();
            }
            st.push(i);
        }
        
        for(int i = 0; i < nums.length;++i){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                ans[st.peek()] = nums[i];
                st.pop();
            }
            
        }
    
    return ans;
    }
    
}

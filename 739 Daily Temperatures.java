//739 Daily Temperatures.java
class Solution {
    public int[] dailyTemperatures(int[] T) {
    
        int[] ans = new int[T.length];
        //represents indexes of the elements which are lesser than the current 
        //element
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < T.length; ++i){
            //let's see how many nodes are lesser than the current node
                
                //keep popping the elements as long as I see the larger element
                while(!st.isEmpty() && T[st.peek()] < T[i]){
                    ans[st.peek()] = i-st.peek();
                    st.pop();
                }
            st.push(i);
        }
        return ans;
    }
    
}

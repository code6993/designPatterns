package com.dynamic.prog;

import java.util.HashMap;
import java.util.Map;
/*
 * Note that greedy solution availble in LC is only applicable if it is gauranteed that we will reach the end using some path
 * If it is not gauranteed that we will be able to reach the end, we need to have DP approach.
 * Eg- Greedy will fail at following : {2,3,1,1,0,0,4}; and {0,2,3,1,1,4}
 * To fix the greedy approach, Line no 42 should be modified to currentJumpEnd>=nums.length-1 ? jumps:0;
 */
public class JumpGameDPGreedyLC45 {
    static Map<Integer,Integer> mp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {0,2,3,1,1,0,0,0,4};
		
		System.out.println(jumpDP(ar));
		
		System.out.println(jump(ar));

	}
	
	private static  int jumpDP(int[] nums) {
        mp=new HashMap<Integer,Integer>();
        int ans = helper(0,nums);
        return ans==Integer.MAX_VALUE?0:ans-1;
    }
	
	private static int jump(int[] nums) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // we continuously find the how far we can reach in the current jump
            farthest = Math.max(farthest, i + nums[i]);
            // if we have come to the end of the current jump,
            // we need to make another jump
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }
	
	private static int helper(int idx, int[] nums){
        //System.out.println("Evaluating : "+idx+" at "+nums[idx]);
        if(mp.containsKey(idx))return mp.get(idx);
        if(idx>=nums.length-1)return 1;
        if(nums[idx]==0)return Integer.MAX_VALUE;
        int lim=Math.min(nums[idx],nums.length-1);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<lim;i++){
            ans=Math.min(ans,helper(i+idx+1,nums));
        }
        mp.put(idx,ans==Integer.MAX_VALUE?ans:ans+1);
        return ans==Integer.MAX_VALUE?ans:ans+1;
    }
	
}

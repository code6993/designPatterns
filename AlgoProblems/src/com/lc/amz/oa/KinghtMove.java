package com.lc.amz.oa;
import java.util.*;
public class KinghtMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = minKnightMoves(2,112);
		System.out.println(i);

	}
	
    public static int minKnightMoves(int x, int y) {
        int[][] dirs = new int[][]{{-1,-2},{-2,-1},{-2,1},{-1,2},
                                  {1,2},{2,1},{2,-1},{1,-2}};
        x=Math.abs(x);
        y=Math.abs(y);
        Queue<ArrayList<Integer>> q = new LinkedList<ArrayList<Integer>>();
        int step=0;
        ArrayList<Integer> k = new ArrayList<>();
        k.add(0);
        k.add(0);
        q.offer(k);
        Set<ArrayList<Integer>> st = new HashSet<ArrayList<Integer>>();
        //since we are just considering positive we have to handel case of access from negative
        if(x==1 && y==1)return 2;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                ArrayList<Integer> xy = q.poll();
                if(xy.get(0)==x && xy.get(1)==y)return step;
                if(xy.get(0)<0 || xy.get(1)<0)continue;
                for(int[] dir :dirs){
                    int newx = dir[0]+xy.get(0);
                    int newy = dir[1]+xy.get(1);
                    ArrayList<Integer> d = new ArrayList<>();
                    d.add(newx);
                    d.add(newy);
                    if(!st.contains(d)){
                        q.offer(d); 
                        st.add(d);

                    }
                }
            }
            step++;
        }
        return -1;
    }

}

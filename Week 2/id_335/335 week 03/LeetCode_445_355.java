package com.fuzhi.linktable.BaseAlgorithm.Recursion;

import java.util.Arrays;

public class AssignCookies {
	 public int findContentChildren(int[] g, int[] s) {
	     Arrays.sort(g); // 胃口值
	     Arrays.sort(s); // 饼值
	     int res = 0;
	     for(int gi = 0,si = 0;gi<g.length && si < s.length ; ){
	    	if(g[gi]<= s[si]){
	    		res +=1;
	    		gi+=1;
	    		si+=1;
	    	}else{
	    		si +=1;
	    	}
	     }
		 return res;
	 }
	 
	 
	 public static void main(String[] args) {
		 AssignCookies ac = new AssignCookies();
		 int[] g = new int[]{1,2,3};
		 int[] s = new int[]{1,1,2};
		 int out = ac.findContentChildren(g, s);
		 System.out.println("out:"+out);
	}
}

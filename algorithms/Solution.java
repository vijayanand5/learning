package algorithms;


import java.io.*;
import java.util.*;

class Solution {
 	public static void main(String[] argv) {
		int[][] arrayOfArrays = {
			{},
			{1,2,3,4},
			{5,6},
			{},
			{7},
			{8,9,10},
			{}
		};
		print(arrayOfArrays);
		reverse(arrayOfArrays);
		print(arrayOfArrays);
  }

	private static void print(int[][] arrayOfArrays) {
		System.out.println("[");
		for(int[] subList : arrayOfArrays) {
			System.out.print("\t[");
			for(int i = 0; i < subList.length; i++) {
				if(i > 0) {
					System.out.print(", ");
				}
				System.out.print(subList[i]);
			}	
			System.out.println("]");
		}
		System.out.println("]");
	}

	private static void reverse(int[][] aoa) {
    // IMPLEMENT THIS IN PLACE
    int arrLength=aoa.length;
    int startIndex=0;
    int i=0,j=aoa.length-1;int endIndex=aoa[j].length-1;
    while(i<=j){
      
      while(aoa[i].length==0){
        i++;
      }
      while(aoa[j].length==0){
        j--;
      }
      if(endIndex==-1)
        endIndex=aoa[j].length-1;
      while(startIndex<aoa[i].length || endIndex>=0){
        int t = aoa[j][endIndex];
        aoa[j][endIndex]=aoa[i][startIndex];
        aoa[i][startIndex]=t;      
        endIndex--;
        startIndex++;      
     }
      if(endIndex<0)
        j--;
      if(startIndex==aoa[i].length){
        i++;
        startIndex=0;
    }
      
    }
    
	}
}

/* The outpur should look like this

[
	[]
	[1, 2, 3, 4]
	[5, 6]
	[]
	[7]
	[8, 9, 10]
	[]
]
[
	[]
	[10, 9, 8, 7]
	[6, 5]
	[]
	[4]
	[3, 2, 1]
	[]
]

*/
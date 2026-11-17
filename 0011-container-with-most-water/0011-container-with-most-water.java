class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j =height.length - 1;
        int calMaxArea=Integer.MIN_VALUE;
        int calArea=0;
        while(i<j){
            calArea=(j-i)*Math.min(height[i],height[j]);
            if(calArea>calMaxArea){
                calMaxArea=calArea;
            }
            if (height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }          
        return calMaxArea;
    }
    }
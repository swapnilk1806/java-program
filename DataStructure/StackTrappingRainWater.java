package collage.DataStructure;

import java.util.Stack;

public class StackTrappingRainWater {

    public static int MaxWater(int [] height){
        Stack<Integer> s = new Stack<>();
        int n = height.length;
        int ans = 0;

        for (int i=0; i<n; i++){
            while((!s.isEmpty()) && (height[s.peek()] >= height[i])){
                int pop_height = height[i];
                s.pop();
                if(s.isEmpty()){
                    break;
                }
                int distace = i - s.peek() - 1;

                int main_height = Math.min(height[s.peek()],height[i]) - pop_height;
                ans += distace * main_height;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

     int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println( MaxWater(arr));

    }
}

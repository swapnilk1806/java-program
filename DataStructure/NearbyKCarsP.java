package collage.DataStructure;

import java.util.PriorityQueue;
import java.util.*;

public class NearbyKCarsP {
    public static class Point implements Comparable<Point> {
        int x;
        int y;
        int distance;
        int in;
        public Point(int x,int y,int distance,int i){
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.in = i;
        }
        @Override
        public int compareTo(Point s2){
            return this.distance - s2.distance;
        }
    }
    public static void main(String[] args) {


        int [][] arr = {{3,3},{5,-1},{-2,4}};
         /*
                Distance
                c0 = 3 , 3
                c1 = 5 , -1
                c2 = -2, 4

          */
        PriorityQueue<Point> p1 = new PriorityQueue<>();
        for (int i =0; i<arr.length; i++){
            int dist = (int) ((int) Math.pow(arr[i][0],2) + Math.pow(arr[i][1],2));

            p1.add(new Point(arr[i][0],arr[i][0],dist,i));
        }


        for (int i=0; i<2; i++){
            System.out.println("C"+p1.remove().in);
        }
    }
}

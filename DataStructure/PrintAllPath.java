package collage.DataStructure;

import java.util.ArrayList;

public class PrintAllPath {
    static class Edge{
        int scr;
        int dest;
        public Edge(int s,int d){
            this.dest = d;
            this.scr = s;
        }
    }
    public static void Create(ArrayList<Edge>[] graph){

        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void printAll(ArrayList<Edge> [] graph,int scr,int dest,String path){
        if(scr == dest){
            System.out.println(path+dest);
            return;
        }
        for (int i=0; i<graph[scr].size(); i++){
            Edge e = graph[scr].get(i);
            printAll(graph,e.dest,dest,path+scr);
        }
    }
    public static void main(String[] args) {
      ArrayList<Edge> [] graph = new ArrayList[6];

      Create(graph);
        System.out.println("All path from source to destination");
      printAll(graph,5,1,"");
    }
}

package collage.DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGrpha {
    static class Edge{
        int scr;
        int dest;
        public Edge(int s,int d){
            this.dest = d;
            this.scr = s;
        }
    }
  public static void Creat(ArrayList<Edge> [] graph){
      for (int i=0; i<graph.length; i++){
          graph[i] = new ArrayList<>();
      }
      // Vertex 0
      graph[0].add(new Edge(0,1));
      graph[0].add(new Edge(0,4));


      //Vertx 1
      graph[1].add(new Edge(1,4));
      graph[1].add(new Edge(1,2));

      // vertx 2
      graph[2].add(new Edge(2,4));
      graph[2].add(new Edge(2,3));
      graph[2].add(new Edge(2,4));

      //Vertx 3
      graph[3].add(new Edge(3,4));

      //Vertx 4
      graph[4].add(new Edge(4,1));
      graph[4].add(new Edge(4,3));
  }
    public static void BFS(ArrayList<Edge> [] garph,boolean [] visit){
        Queue<Integer> q = new LinkedList<>();
        boolean  vis [] = new boolean[garph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if((!vis[curr]) && (visit[curr])){

                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i=0; i<garph[curr].size(); i++){
                    Edge e = garph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void BFSbulder(ArrayList<Edge> [] graph){
        boolean [] visit = new boolean[10];

        for (int i=0; i<graph.length; i++){
            if(!visit[i]){
                BFS(graph,visit);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[10];

        Creat(graph);
        BFSbulder(graph);
    }
}

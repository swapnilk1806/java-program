//package collage.DataStructure;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class CheapestFloghtsWithinKstop {
//    static class Edge{
//        int scr;
//        int dest;
//        int weight;
//        Edge(int s,int d,int w){
//            this.dest = d;
//            this.scr = s;
//            this.weight = w;
//        }
//    }
//
//    public static void CreateGraph(int [][] flight, ArrayList<Edge> [] graph){
//        for (int i=0; i<graph.length; i++){
//            graph[i] = new ArrayList<>();
//        }
//        for (int i=0; i<flight.length; i++){
//            int s = flight[i][0];
//            int d = flight[i][1];;
//            int w = flight[i][2];
//
//            Edge e = new Edge(s,d,w);
//            graph[s].add(e);
//        }
//    }
//
//    static class Info{
//        int v;
//        int cost;
//        int stop;
//
//        public Info(int v,int cost,int stop){
//            this.v = v;
//            this.cost = cost;
//            this.stop = stop;
//        }
//    }
//    public static int Cheap(ArrayList<Edge> [] graph,int scr,int dest,int k){
//        int dist[] = new int[graph.length];
//
//        for (int i=0; i< dist.length; i++){
//            if(i != scr){
//                dist[i] = Integer.MAX_VALUE;
//            }
//        }
//
//        Queue<Info> p = new LinkedList<>();;
//
//        p.add(new Info(scr,0,0));
//
//        while (!p.isEmpty()){
//            Info curr = p.remove();
//
//            if(curr.stop > k){
//                break;
//            }
//            for (int i=0; i<graph[curr.v].size(); i++){
//                Edge e = graph[curr.v].get(i);
//                int u = e.scr;
//                int v = e.dest;
//                int wt = e.weight;
//
//                if (curr.v + wt < dist[v] && curr.stop <=k ) {
//                    dist[v] = curr.v + wt;
//                    p.add(new Info(v,dist[v],curr.stop+1));
//                }
//            }
//        }
//        if(dist[dest] == Integer.MAX_VALUE){
//            return -1;
//        }
//        return dist[dest];
//    }
//    public static void main(String[] args) {
//        int n =0;
//        int fligh[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
//        int scr = 0, dest = 3, k = 1;
//
//        ArrayList<Edge> [] graph = new ArrayList[4];
//       CreateGraph(fligh,graph);
//
//        System.out.println(Cheap(graph,scr,dest,k));
//    }
//}

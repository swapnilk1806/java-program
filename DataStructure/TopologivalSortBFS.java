//package collage.DataStructure;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class TopologivalSortBFS {
//    static class Edge{
//        int scr;
//        int dest;
//        public Edge(int s,int d){
//            this.dest = d;
//            this.scr = s;
//        }
//    }
//    public static void Create(ArrayList<Edge>[] graph){
//
//        for (int i=0; i<graph.length; i++){
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[2].add(new Edge(2,3));
//
//        graph[3].add(new Edge(3,1));
//
//        graph[4].add(new Edge(4,0));
//        graph[4].add(new Edge(4,1));
//
//        graph[5].add(new Edge(5,0));
//        graph[5].add(new Edge(5,2));
//    }
//    /// Calculate Indegre
//    public static void CalIndeG(ArrayList<Edge> [] graph,int indeg[]){
//        for (int i=0; i<graph.length; i++){
//            int v = i;
//            for (int j=0; j<graph[v].size(); i++){
//                Edge e = graph[v].get(j);
//                indeg[e.dest]++;
//            }
//        }
//    }
//
//    public static void TopSort(ArrayList<Edge> [] grpha){
//        int [] indeg = new int[grpha.length];
//
//        CalIndeG(grpha,indeg);
//        Queue<Integer> q = new LinkedList<>();
//
//        for (int i=0; i<indeg.length; i++){
//            if(indeg[i] == 0){
//                q.add(i);
//            }
//        }
//
//        while (!q.isEmpty()){
//            int curr = q.remove();
//            System.out.print(curr + " ");
//
//            for (int i=0; i<indeg.length; i++){
//                Edge e = grpha[curr].get(i);
//                indeg[e.dest]--;
//                if(indeg[e.dest] == 0){
//                    q.add(e.dest);
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        ArrayList<Edge> [] graph = new ArrayList[6];
//
//        TopSort(graph);
//    }
//}

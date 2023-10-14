

package collage.DataStructure;

import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rank;
    Student(String name,int rank){
        this.rank = rank;
        this.name = name;
    }
    @Override
    public int compareTo(Student s2){
        return this.rank - s2.rank;
    }
}
public class ProrityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> s = new PriorityQueue<>();


        s.add(new Student("A",12));
        s.add(new Student("B",66));
        s.add(new Student("C",78));
        s.add(new Student("D",90));

     List<Student> s1 = new ArrayList<>();

     s1.add(new Student("Swapnil kadam",66));
     s1.add(new Student("komal kadam",90));
     s1.add(new Student("Srushti kadam",45));
     s1.add(new Student("Prachi kadam",12));

        Collections.sort(s1,Comparator.comparingInt(o->o.rank));

       while (!s1.isEmpty()){
           System.out.println("Name : "+s1.get(0).name + "  Rank " +s1.remove(0).rank);
       }
//        while(!s.isEmpty()){
//            System.out.println(s.peek().name + " "+ s.remove().rank);
//        }
    }
}

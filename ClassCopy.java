

package collage;


class student{
    int roll;
    String name;
    float cgpa;
    student(student s){
      this.roll =  s.roll;
      this.name =   s.name;
      this.cgpa =  s.cgpa;;
    }

    student(int roll,String name,float cgpa){
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    void Display(){
        System.out.println("Roll : "+this.roll);
        System.out.println("Name : "+this.name);
        System.out.println("Cgpa : "+this.cgpa);

    }
}
public class  ClassCopy {
    public static void main(String[] args) {

            student s1 = new student(66,"swapnil",9.7f);
            student s2 = new student(s1);
            s2.name = "Golu";
        s1.Display();
        s2.Display();
//        for (int i=0; i<100; i++){
//
//            System.out.println((int)Math.floor(Math.random()*100)+50);
//        }
    }
}

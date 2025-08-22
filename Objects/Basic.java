public class Basic {
     public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Rama";
        s1.cgpa=8.7;
        s1.study();
        s1.write();
        System.out.println("----------------------------------------------");
        Student s2=new Student();
        s2.name="Krishna";
        s2.cgpa=9.8;
         s2.study();
        s2.write();

        
    }
    }

    class Student{
        String name;
        double cgpa;
        void study(){
            System.out.println(name+" ");
        }
        void write(){
            System.out.println(name+"is writing the cgpa is "+cgpa);
        }
    }
   
    


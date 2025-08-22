public class Employee {
    int eid;
    double ctc;
    void work(){
        System.out.println(eid+"is working the ctc is "+ctc);
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.eid=101;
        e1.ctc=5.5;
        e1.work();

        Employee e2 = new Employee();
        e2.eid=101;
        e2.ctc=6.4;
        e2.work();

        Employee e3 = new Employee();
        e3.eid=101;
        e3.ctc=7;
        e3.work();
        
    }
    
}

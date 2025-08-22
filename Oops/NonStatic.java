// // public class NonStatic {
// //      class Delta {
// //         int x =143;

// //         void test(){

// //         }
// //     }
// //     public class Mainclass{

// //         public static void main(String[] args) {
// //             System.out.println(new Delta().x);
// //             new Delta().test();
// //         }
// //     }
    
// // }



// public class NonStatic {
//     class Example{
//         int a=50;
//         char b='j';
//         void disp(){
//             System.out.println("Executing disp()...");
//         }
//         void help(){
//             System.out.println("Executing help().....");
//         }
//     }
//     public class Mainclass{

        
//         public static void main(String[] args) {
//             Example ex = new Example();
//             System.out.println(ex.a);
//             System.out.println(ex.b);
//             ex.disp();
//             ex.help();;
//     }

        
//     }
// }


public class NonStatic {
    class Example {
        int a = 50;
        char b = 'j';
        void disp() {
            System.out.println("Executing disp()...");
        }
        void help() {
            System.out.println("Executing help().....");
        }
    }

    public static class Mainclass {
        public static void main(String[] args) {
            NonStatic outer = new NonStatic();     // ✅ outer class object
            Example ex = outer.new Example();      // ✅ create inner class object

            System.out.println(ex.a);
            System.out.println(ex.b);
            ex.disp();
            ex.help();
        }
    }
}

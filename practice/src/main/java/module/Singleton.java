package module;

public class Singleton {
public static void main(String[] args){
    //  Abc obj1 =  Abc.getInstance();
    // Abc1 obj2 =  Abc1.getInstance();

    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            Abc2 obj3 =  Abc2.getInstance();
        }
    });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            Abc2 obj3 =  Abc2.getInstance();
        }
    });
  t1.start();
  t2.start();

//    Abc3 obj3 = Abc3.INSTANCE;
//    obj3.i = 5;
//    obj3.show();
//
//    Abc3 obj4 = Abc3.INSTANCE;
//    obj4.i = 6;
//    obj3.show();
}



}

class Abc  {
     static Abc obj = new Abc(); //This object will always be in memory that's the problem we solve it by lazy and eager (This is eagerly instance)
     private Abc(){
        System.out.println("Private Constructor Abc");
            }
            public static Abc getInstance(){
        System.out.println("Returning obj");
        return obj;
            }
}



class Abc1  {
    private static Abc1 obj; //Initialization
    private Abc1(){
        System.out.println("Private Constructor Abc");
    }
    public static Abc1 getInstance(){
        if (obj==null) {
            obj = new Abc1(); //This is lazy instance creation
            System.out.println("Returning obj");
        }
        return obj;
    }
}



class Abc2 {
    private static Abc2 obj;

    private Abc2() { // Double Check Locking
        System.out.println("Private Constructor Abc");
    }

    public static Abc2 getInstance() {
        if (obj == null) {
            synchronized (Abc2.class) {
                if (obj == null) {
                    obj = new Abc2(); //when two threads at the same time create object the singleton will fail whereas we can use sleep between threads or synchronize at the statement level not at the function level
                    System.out.println("Returning obj");
                }
            }
        }
        return obj;
    }
}

//Enum Pattern

enum Abc3 //Special type of class
{ INSTANCE;
    int i;
    public void show()
    {
        System.out.println(i);
    }

}


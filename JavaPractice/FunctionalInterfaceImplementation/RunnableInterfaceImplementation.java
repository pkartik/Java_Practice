package JavaPractice.FunctionalInterfaceImplementation;

//Java Program to demo Functional Interface

//Before Java 8, we had to create anonymous inner class objects or implement these interfaces.

class Test{
public static void main(String[] args) {
    //create anonymous inner class object

    new Thread(new Runnable() {
        
        @Override public void run(){
            System.out.println("New thread created");
        }
        
    }).start();
}

}
package JavaPractice.FunctionalInterfaceImplementation;



//Java program to demonstrate the implementation of functional interface using lambda expressions
class Test{
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("New thread created");
        }).start();
    }
}
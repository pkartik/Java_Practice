package JavaPractice.MarkerInterface;

class A implements Cloneable{
    int i ;
    String s;

    public A(int i, String s){
        this.i=i;
        this.s=s;
    }


    //Overriding clone() method

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloneableInterfaceImplementation{

    public static void main(String[] args) throws CloneNotSupportedException {
         A a = new A(20,"My name is Kartik");

        // cloning 'a' and holding 
        // new cloned object reference in b 
  
        // down-casting as clone() return type is Object  

        A b = (A)a.clone();
        System.out.println(b.i);
        System.out.println(b.s);
    }
    
}
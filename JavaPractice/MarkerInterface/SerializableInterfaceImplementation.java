package JavaPractice.MarkerInterface;

import java.io.*;

class A implements Serializable{
    int i;
    String s; 

    public A(int i, String s){
        this.i =i;
        this.s =s;
    }

}


public class SerializableInterfaceImplementation{
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
     A a = new A(20,"Kartik is smart engineer");
     
     //Serializing 'a'
     FileOutputStream fos = new FileOutputStream("xyz.txt");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(a);


     //De-serializing 'a'

     FileInputStream fis = new FileInputStream("xyz.txt");
     ObjectInputStream ois = new ObjectInputStream(fis);
     A b = (A)ois.readObject();

     System.out.println(b.i+" "+b.s);


     oos.close();
     ois.close();


    }
    
}
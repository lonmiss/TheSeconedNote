package Class1017;

public class Dog extends Animal implements Comparable{
    public void shout(){
        System.out.println("Dog shout!");
    }
    public int comparTo(Object other){
        return 0;
    }
}

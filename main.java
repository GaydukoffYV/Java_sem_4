import java.util.function.Function;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class main {

    public static void age(String[] args) {
        Consumer<Integer> consumer = x -> System.out.println("Мой возраст " + x);
        consumer.accept(15);
    }

    public static void main1(String[] args) {
        Function <Integer, String> function = (x) -> String.valueOf(x) + "Мой возраст";
        System.out.println(function.apply(15));  
    }
    public static void main(String[] args) {
        
        Children children = new Children(3, null, null, 0, null);
        // Mother mother = new Mother(2, null, null, 0, null);
        // Father father = new Father(1, null, null, 0, null);
        // Grandmother grandmother = new Grandmother(3, null, null, 0, null);
        // Grandfather grandfather = new Grandfather(4, null, null, 0, null);
        // FatherIn ob = new FatherIn(ob);
        // MatherIn ob1 = new MatherIn();
        children.Hello();
        // mother.Hello();
        // father.Hello();
        // grandmother.Hello();
        // grandfather.Hello();
        // System.out.println( ob.extracted());
        // System.out.println( ob1.Hello2());
        children.getForce();
        children.getFlexibility();
        children.main();
        // children.function();
    }
    


}

import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 24/01/2022.
 */
public class Teststack {
    public static void main(String[] args) {
        Arraystack<Integer>mystack=new Arraystack<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("is the stack empty?"+mystack.isempty());
        System.out.println("input elments");
        for (int i = 0; i <5 ; i++) {
            mystack.push(in.nextInt());
            System.out.println("deleted elments="+mystack.pop());
            System.out.println("top elments="+mystack.top());
            System.out.println("siz="+mystack.size());
            System.out.println("is the stack empty="+mystack.isempty());

        }
    }
}

import java.util.Scanner;
public class lovesix {

    public static void main(String[] args) {
        lovesix obj = new lovesix();
        System.out.println(obj.love6(6, 4));
        System.out.println(obj.love6(4, 5));
        System.out.println(obj.love6(1, 5));
    }
public boolean love6(int a, int b) {
    return (a==6 || b==6 || a-b == 6 || a+b == 6 || b-a == 6);
  }
}
  
import java.util.*;

public class thirtyfive{

    public static void main (String args[]){
        thirtyfive obj = new thirtyfive();
        System.out.println(obj.old35(3));
        System.out.println(obj.old35(10));
        System.out.println(obj.old35(15));
    }
    // Return true if the given non-negative number is a multiple of 3 or 5, but not both.
    public boolean old35(int n) {
        if(n%3==0 && n%5==0){
              return false;
          }
          if (n%3==0){
              return true;
          }else if (n%5==0){
              return true;
          }else{
              return false;
          }
      }
}

import java.util.*;

public class moretwenty {
    public static void main (String args[]){
        moretwenty obj = new moretwenty();
        System.out.println(obj.more20(3));
        System.out.println(obj.more20(10));
        System.out.println(obj.more20(15));
    }
//Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    public boolean more20(int n) {
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

    

import java.util.Scanner;

public class squirrelplay {
    public static void main(String[] args) {
        squirrelplay obj = new squirrelplay();
        System.out.println(obj.squirrelPlay(70, false));
        System.out.println(obj.squirrelPlay(95, true));
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer && temp >= 60 && temp <= 100)
            return true;

        if (!isSummer && temp >= 60 && temp <= 90)
            return true;

        return false; // return false if conditions are not met
    }
}

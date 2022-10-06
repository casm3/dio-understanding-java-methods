package first.lesson.activity;

/**
 * Author: Carlos Melo
 */

public class Greeting {
    protected static String greetUser(int time) {
        if (time >= 5 && time <= 12)
            return "Good Morning";
        else if (time >= 12 && time <= 18)
            return "Good Afternoon";
        else if (time >= 18 && time <= 21)
            return "Good Evening";
        else if (time > 24)
            return "Invalid time";
        else
            return "Goodnight";
    }
}

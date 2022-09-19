package selennium;

import java.util.Locale;

public class Browser {
    public static void main(String[] args) {
        Browser br = new Browser();
        if (br.browserName("chrome")) {
            System.out.println("Enter url");
        }
    }

    ;


    public boolean browserName(String name) {

        System.out.println("Browser name:" + name);
        boolean flag = false;
        switch (name.toLowerCase(Locale.ROOT)) {
            case "chrome":
                System.out.println("lunch chrome");
                flag = true;
                break;
            case "firefox":
                System.out.println("lunch firefox");
                flag = true;
                break;
            case "safari":
                System.out.println("lunch safari");
                flag = true;
                break;
            default:
                System.out.println("This browser is not found" + name);
                break;
        }
        return flag;


    }
}
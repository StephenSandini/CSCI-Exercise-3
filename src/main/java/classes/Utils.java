package classes;

public class Utils {
    // Poor naming, duplicate logic, code smell
    public static boolean checkName(String name) {
        if (name != null && name.length() > 0) return true;
        else return false;
    }

    public static boolean isValidAge(int age) {
        if (age < 0 || age > 119) return false;
        else return true;
    }
}

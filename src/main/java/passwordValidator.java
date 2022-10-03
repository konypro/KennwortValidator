public class passwordValidator {
    public static boolean isLongerThan7(String password) {
        return password.length() > 7;
    }

    public static boolean containsDiget(String password) {
        char [] kagdajabukva = password.toCharArray();
        for (int i = 0; i<password.length();i++){
            if (Character.isDigit(kagdajabukva[i])) {
                return true;
            }
        }
        return false;
    }
}

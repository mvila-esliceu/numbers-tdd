public class NumbersCat {
    public static String say(long number) {
        switch ((int) number) {
            case 0:
                return "Zero";
            case 1:
                return "Un";
            case 2:
                return "Dos";
            case 7:
                return "Set";
            default:
                return "";
        }

    }
}

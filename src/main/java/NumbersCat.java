public class NumbersCat {
    public static String say(long number) {
        String[] naturals = {"Zero", "Un", "Dos", "Tres", "Quatre", "Cinc", "Sis", "Set", "Vuit", "Nou"};

        return naturals[(int) number];
    }
}

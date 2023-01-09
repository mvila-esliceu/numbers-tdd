public class NumbersCat {
    public static String say(long number) {
        String nombre = "";
        String[] naturals = {"zero", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"};

        int index = (int) Math.abs(number);

        if(number < 0) {
            nombre += "Menys ";
        }

        nombre += naturals[index];

        return nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
    }
}

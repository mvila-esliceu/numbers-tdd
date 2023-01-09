public class NumbersCat {

    static String[] naturals = {"zero", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"};
    static String[] decenes = {"", "deu", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};

    public static String say(long number) {
        if (number == 0) {
            return "Zero";
        }

        String nombre = "";


        if (number < 0) {
            nombre += "Menys ";
        }

        long nombrePositiu = Math.abs(number);

        nombre += generaNombre(nombrePositiu);

        return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
    }

    private static String generaNombre(long nombre) {
        String nombreStr = "";
        if (nombre > 10) {
            int decena = (int) nombre / 10;
            nombreStr += decenes[decena];
            long unitat = nombre % 10;
            if (unitat > 0) {
                nombreStr += "-" + generaNombre(unitat);
            }
        } else {
            nombreStr += naturals[(int) nombre];
        }

        return nombreStr;
    }
}

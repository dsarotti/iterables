public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("1º) abecedario completo: ");
        System.out.println("------------------------------------");

        Abecedario abc = new Abecedario();
        for (char x : abc) {
            System.out.println("caracter: " + x);
        }
        System.out.println("------------------------------------");
        System.out.println("Fin de la 1º parte.");

        // La salida por consola debería ser:
        // caracter: a
        // caracter: b
        // caracter: c
        // caracter: d
        // caracter: e
        // ...

        System.out.println("====================================");
        System.out.println("2º) Vocales desde la clase Abecedario: ");
        System.out.println("------------------------------------");

        Abecedario abcb = new Abecedario();
        Abecedario.AbcIterator iter = abcb.iterator();
        while (iter.hasNextVocal()) {
            System.out.println("vocal: " + iter.nextVocal());
        }
        System.out.println("------------------------------------");
        System.out.println("Fin de la 2º parte.");

        // La salida por consola debería ser:
        // vocal: a
        // vocal: e
        // vocal: i
        // ...

        System.out.println("====================================");
        System.out.println("3º) Vocales desde la subclase \"Vocal\" ");
        System.out.println("------------------------------------");

        Vocal voc = new Vocal();
        for (char x : voc) {
            System.out.println("Vocal: " + x);
        }

        System.out.println("------------------------------------");
        System.out.println("Fin de la 3º parte.");
        System.out.println("------------------------------------");
        // La salida por consola debería ser:
        // Vocal: a
        // Vocal: e
        // Vocal: i
        // ...
    }
}
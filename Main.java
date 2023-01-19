import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Abecedario abc = new Abecedario();
        for (char x : abc) {
            System.out.println("caracter: " + x);
        }
        // La salida por consola debería ser:
        // caracter: a
        // caracter: b
        // caracter: c
        // caracter: d
        // caracter: e
        // ...

        Abecedario abcb = new Abecedario();
        Abecedario.AbcIterator iter = abcb.iterator();
        while (iter.hasNextVocal()) {
            System.out.println("vocal: " + iter.nextVocal());
        }
        // La salida por consola debería ser:
        // vocal: a
        // vocal: e
        // vocal: i
        // ...

        // Vocales voc = new Vocales();
        // for (char x : voc) {
        //     System.out.println("Vocal: " + x);
        // }
        // La salida por consola debería ser:
        // Vocal: a
        // Vocal: e
        // Vocal: i
        // ...

        // Abecedario abc = new Abecedario();
        // for (Character letra : abc) {
        // System.out.println(letra);
        // }
        // for (Character letra : abc) {
        // System.out.println(itr.nextVocal());
        // }
    }
}
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Abecedario implements Iterable<Character> {
    private final Character[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
    private final int[] vocPos = { 0, 4, 8, 14, 20 };

    @Override
    public AbcIterator iterator() {
        return new AbcIterator();
    }

    class AbcIterator implements Iterator<Character> {
        int pos = 0;

        @Override
        public boolean hasNext() throws NoSuchElementException {
            return pos < letras.length;
        }

        @Override
        public Character next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                return letras[pos++];
            }
        }

        public boolean hasNextVocal() {
            return pos < vocPos[vocPos.length - 1];
        }

        public Character nextVocal() throws NoSuchElementException {
            if (!hasNextVocal()) {
                throw new NoSuchElementException();
            } else {
                for (int i = 0; i < vocPos.length; i++) {
                    if (pos <= vocPos[i]) {
                        pos = vocPos[i];
                        break;
                    }
                }
            }
            return letras[pos++];
        }
    }
}
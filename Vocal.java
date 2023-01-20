import java.util.NoSuchElementException;

public class Vocal extends Abecedario {

    @Override
    public VocalIterator iterator(){
        return new VocalIterator();       
    }

    class VocalIterator extends AbcIterator{
        int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < vocPos[vocPos.length - 1];
        }

        @Override
        public Character next() throws NoSuchElementException  {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else if (pos!=0){
                for (int i = 0; i < vocPos.length; i++) {
                    if (pos < vocPos[i]) {
                        pos = vocPos[i];
                        break;
                    }
                }
            }
            return letras[pos++];
        }
    }
}
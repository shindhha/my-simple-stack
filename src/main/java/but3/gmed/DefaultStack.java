package but3.gmed;

import java.util.EmptyStackException;

/*modification pour le TP*/
/*modification 2 pour le TP*/
/*modification 3 pour le TP*/
public class DefaultStack implements SimpleStack {
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}

package but3.gmed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStackTest {

    @Test
    void isEmptyOnNonEmptyStack() {
        // GIVEN Une pile par defaut a qui on ajoute un item
        DefaultStack defaultStack = new DefaultStack();
        defaultStack.push(new DefaultItem());
        // EXPECTED Lorsqu'on appelle la méthode "isEmpty" alors on me renvoie "false"
        assertFalse(defaultStack.isEmpty());
    }

    @Test
    void getSize() {
    }

    @Test
    void push() {
    }

    @Test
    void peek() {
    }

    @Test
    void pop() {
    }
}
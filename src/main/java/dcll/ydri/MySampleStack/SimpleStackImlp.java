package dcll.ydri.MySampleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Younes on 14/04/2016.
 */
final class SimpleStackImlp implements SampleStack {

    /**
     * ldksqlmkdsqmfkqmfkqof.
     */
    private Stack<Object> wrapperStack = new Stack<Object>();

    @Override
    public boolean isEmpty() {

        return wrapperStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrapperStack.size();
    }

    @Override
    public void push(final Item item) {
        wrapperStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrapperStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrapperStack.pop();
    }
}

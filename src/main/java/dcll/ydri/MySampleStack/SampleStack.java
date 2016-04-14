package dcll.ydri.MySampleStack;

import java.util.EmptyStackException;

/**
 * Created by Younes on 14/04/2016.
 */
public interface SampleStack {

    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;
}

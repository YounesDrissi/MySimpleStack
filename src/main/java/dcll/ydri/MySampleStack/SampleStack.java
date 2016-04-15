package dcll.ydri.MySampleStack;

import java.util.EmptyStackException;

/**
 * Created by Younes on 14/04/2016.
 *
 * commenatire exigence #1
 */
public interface SampleStack {

    /**
     *test si la pile est vide.
     * @return un boolean indiquant
     */
     boolean isEmpty();

    /**
     *kkps.
     * @return mkmfdls
     */
     int getSize();

    /**
     *lmkmfl.
     * @param item lmdsm
     */
     void push(Item item);

    /**
     *dgdgsg.
     * @return sdgd
     * @throws EmptyStackException mùklfgkdfo
     */
     Item peek() throws EmptyStackException;

    /**
     *mùdsmlfds.
     * @return fzzef
     * @throws EmptyStackException kjffjd
     */
     Item pop() throws EmptyStackException;
}

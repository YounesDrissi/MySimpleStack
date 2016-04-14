package dcll.ydri.MySampleStack;

/**
 * Created by Younes on 14/04/2016.
 */
public class Item {

    private Object value;

    Item(Object value){
        setValue(value);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

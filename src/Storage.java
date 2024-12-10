public class Storage<T> {

    private T item;
    private T alteritem;

    public Storage(T item) {
        this.item = item;
    }

    public T getItem() {
        if (this.item!=null) {return this.item;}
        else {return this.alteritem;}
    }

    public void setAlteritem(T alteritem) {
        this.alteritem = alteritem;
    }
}

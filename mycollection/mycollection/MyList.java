package mycollection;

import java.util.ArrayList;

public abstract class MyList<T> implements MyAbstractList<T> {

    public static final int DEFAULT_CAPACITY = 10;

    private T[] list;

    public MyList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.list = (T[]) new Object[capacity];
    }

    public MyList(T [] list) {
        this.list = list;
    }

    public T[] getList() {
        return list;
    }

    public void setList(T[] list) throws NullPointerException {
        if (list == null) {
            throw new NullPointerException();
        }
        this.list = list;
    }
}

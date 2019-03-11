package mycollection;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> extends MyList<T> {

    public MyArrayList() {
    }

    public MyArrayList(int capacity) {
        super(capacity);
    }

    @Override
    public final int size() {
        int size = 0;

        for (int i = 0; i < getList().length; i++) {
            if (getList()[i] != null) {
                size++;
            }
        }

        return size;
    }

    @Override
    public int capacity() {
        return getList().length;
    }

    @Override
    public boolean isEmpty() {

        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }


    //------------------------------------------------
    private Object[] increaseAndCopyArray() {
        Object[] temp = new Object[(int) (getList().length * 1.5) + 1];
        for (int i = 0; i < getList().length; i++) {
            temp[i] = (T) getList()[i];
        }
        for (int i = getList().length; i < temp.length; i++) {
            temp[i] = null;
        }
        return temp;
    }

    private int takeIndexLastElement() {
        int index = -1;

        for (int i = 0; i < getList().length; i++) {
            if (getList()[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }
    //------------------------------------------------

    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }
        return getList()[index];
    }

    public void set(int index, T element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }

        getList()[index] = element;
    }

    @Override
    public final void add(T t) {
        int index = takeIndexLastElement();

        if (index == -1) {
            T[] tem = (T[]) increaseAndCopyArray();
            setList(tem);
            getList()[takeIndexLastElement()] = t;
        } else {
            getList()[index] = t;
        }
    }

    public void add(int index, T element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }

        T[] temp = (T[]) new Object[capacity() - index];
        for (int i = index, j = 0; i < getList().length; i++, j++) {
            temp[j] = getList()[i];
            getList()[i] = null;
        }
        getList()[index] = element;
        addAll(temp);
    }

    @Override
    public final void addAll(T... t) {
        for (T temp : t) {
            add(temp);
        }
    }

    public void addALL(MyCollection<? extends T> collection) {

    }

    public void remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }

        T[] temp = (T[]) new Object[capacity() - index - 1];
        for (int i = index, j = 0; i < getList().length; i++, j++) {
            temp[j] = getList()[i];
            getList()[i] = null;
        }

        for (int i = 0, j = index; i < temp.length; i++, j++) {
            getList()[j] = temp[i];
        }
    }

    @Override
    public void remove(T t) {
    }

    @Override
    public void removeAll(T... t) {
    }

    public static void main(String[] args) {
        MyList<String> example = new MyArrayList<>(6);

        example.add("Melnik");
        example.add("Melnik");
        String[] qw = {"Dm", "MD", "CC"};
        example.addAll(qw);
        System.out.println(example.size());

        ((MyArrayList<String>) example).add(2, "Mel");
        ((MyArrayList<String>) example).remove(2);

        System.out.println(example.size());


    }
}

package mycollection;

import java.util.Collection;

public interface MyCollection <T>{
//

    int size ();

    int capacity ();

    boolean isEmpty ();

    void add (T t);

    void addAll (T ... t);

    void remove (T t);

    void removeAll (T ... t);

//    Collection

}

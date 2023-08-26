package CuoiKi.Repository;

import java.util.List;

public interface IRepository<E>{
    void remove(int e);

    void add(E e);

    List<E> getAll();

}

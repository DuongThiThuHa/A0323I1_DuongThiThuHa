package ss14_Debug.DemoDebug.mvc.repository;

import java.util.List;

public interface IRepository<E> {
    void remove(E e);

    void add(E e);

    List<E> getAll();
}

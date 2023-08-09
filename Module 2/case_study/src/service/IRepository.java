package service;

import java.util.List;

public interface IRepository<E> {
    void display(E e);
    void add(E e);
    void search(E e);
    void delete(String e);
    List<E> getAll();

}

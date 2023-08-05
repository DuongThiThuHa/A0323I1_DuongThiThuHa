package FuramaResort.Repository;

import FuramaResort.Model.Employee;
import FuramaResort.Model.Person;

public interface IRepository<E extends Person> {
    void add(Employee employee);
}

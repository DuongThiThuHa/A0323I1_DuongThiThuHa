package Furama.service;

import java.io.IOException;

public interface Service {
    public void display();

    public void addNew() throws IOException;

    public void edit();

    public void delete();
}

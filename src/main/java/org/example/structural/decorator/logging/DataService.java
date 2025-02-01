package org.example.structural.decorator.logging;

public interface DataService {

    String create(long anId, String aName);
    String update(long anId, String aName);
    void delete(long anId);
    String read(long anId);

}

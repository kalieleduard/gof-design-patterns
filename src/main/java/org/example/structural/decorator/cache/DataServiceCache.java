package org.example.structural.decorator.cache;

import org.example.structural.decorator.logging.DataService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DataServiceCache extends DataServiceCacheDecorator {

    private final Map<Long, String> cache = new HashMap<>();

    public DataServiceCache(final DataService dataService) {
        super(dataService);
    }

    @Override
    public String read(long anId) {
        if (Objects.nonNull(cache.get(anId))) {
            System.out.println("Customer already in cache");
            return cache.get(anId);
        }

        return super.read(anId);
    }

    @Override
    public void delete(long anId) {
        super.delete(anId);
    }

    @Override
    public String update(long anId, String aName) {
        return super.update(anId, aName);
    }

    @Override
    public String create(long anId, String aName) {
        System.out.println("Inserting customer in cache");
        cache.put(anId, aName);
        return super.create(anId, aName);
    }
}

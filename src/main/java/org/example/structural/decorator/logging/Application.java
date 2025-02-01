package org.example.structural.decorator.logging;
import org.example.structural.decorator.cache.DataServiceCache;
import org.example.structural.decorator.logging.logger.DataServiceLogger;

public class Application {
    public static void main(String[] args) {
        final DataService dataService = new DataServiceLogger(new DataServiceCache(new DefaultDataService()));
        dataService.create(1L, "Kaliel");
        dataService.read(1L);
    }
}

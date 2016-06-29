package singletones;

import java.util.logging.Logger;

/**
 * Created by Yuta-At on 24/05/16.
 * Simpliest singleton
 * Source: https://github.com/iluwatar/java-design-patterns/tree/master/singleton
 */
public class IvoryTower {
    private static IvoryTower ourInstance = new IvoryTower();

    public static IvoryTower getInstance() {
        return ourInstance;
    }

    private IvoryTower() {
    }

    public String doo() {
        return "doo";
    }

}

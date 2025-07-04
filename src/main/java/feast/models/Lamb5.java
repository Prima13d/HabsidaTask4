package feast.models;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Lamb5 {
    private final Goat6 goat6;

    Lamb5(Goat6 goat6) {
        this.goat6 = goat6;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a goat, " + goat6.toString();
    }
}

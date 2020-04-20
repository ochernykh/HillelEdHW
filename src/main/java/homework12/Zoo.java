package homework12;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

    String name;
    Map<Caretaker,Enclosure> enclosures = new HashMap<>();

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Caretaker, Enclosure> getEnclosures() {
        return enclosures;
    }

    public void setEnclosures(Map<Caretaker, Enclosure> enclosures) {
        this.enclosures = enclosures;
    }

    public void hireCaretaker(Caretaker caretaker){
        enclosures.put(caretaker,new Enclosure());
    }

    @Override
    public String toString() {
        return "Zoo{" + '\n' +
                "name='" + name + '\'' +
                ",  " + '\n' + "enclosures=" + enclosures +
                '}';
    }
}

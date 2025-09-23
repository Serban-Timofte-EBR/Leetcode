package OOPFotbal.models;

import java.util.ArrayList;
import java.util.List;

public class Echipa {
    private String nume;
    private List<Jucator> team;

    public Echipa(String nume) {
        this.nume = nume;
        this.team = new ArrayList<>();
    }

    public void addJucator(Jucator jucator) {
        this.team.add(jucator);
    }
}

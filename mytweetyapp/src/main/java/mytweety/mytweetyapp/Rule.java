package mytweety.mytweetyapp;

import org.tweetyproject.logics.pl.syntax.Proposition;

public class Rule {
    private String id;
    private double certaintyFactor;
    private Proposition[] symptoms;

    public Rule(String id, double certaintyFactor, Proposition... symptoms) {
        this.id = id;
        this.certaintyFactor = certaintyFactor;
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rule ID: ").append(id).append("\n");
        sb.append("Certainty Factor: ").append(certaintyFactor).append("\n");
        sb.append("symptoms: ");
        for (Proposition p : symptoms) {
            sb.append(p).append(" ");
        }
        return sb.toString();
    }
}

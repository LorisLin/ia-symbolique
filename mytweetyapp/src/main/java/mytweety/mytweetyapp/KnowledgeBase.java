package mytweety.mytweetyapp;

import org.tweetyproject.logics.pl.syntax.Proposition;

import java.util.HashSet;
import java.util.Set;

public class KnowledgeBase {
    private Set<Proposition> facts;

    public KnowledgeBase() {
        this.facts = new HashSet<>();
    }

    public void addFact(Proposition fact) {
        facts.add(fact);
    }

    public void removeFact(Proposition fact) {
        facts.remove(fact);
    }

    public void displayFacts() {
        System.out.println("Knowledge Base:");
        for (Proposition fact : facts) {
            System.out.println(fact);
        }
    }
}

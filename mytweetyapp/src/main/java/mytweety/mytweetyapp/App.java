package mytweety.mytweetyapp;

import org.tweetyproject.logics.pl.syntax.*;

public class App {
    public static void main(String[] args) {
        // Example of logic proponal creation
        Proposition helloWorld = new Proposition("HelloWorld");
        System.out.println("Initial proposition: " + helloWorld);

        Rule rule1 = new Rule("R1", 0.8, new Proposition("Cough"), new Proposition("Wheezing"), new Proposition("Drugs"));
        System.out.println("Rule 1: " + rule1);

        KnowledgeBase kb = new KnowledgeBase();
        kb.addFact(helloWorld);
        kb.addFact(new Proposition("ContradictionFact"));

        kb.displayFacts();
    }
}

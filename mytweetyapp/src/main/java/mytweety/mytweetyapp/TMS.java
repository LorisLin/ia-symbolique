package mytweety.mytweetyapp;

import org.tweetyproject.logics.pl.syntax.Proposition;

public class TMS {
    private KnowledgeBase kb;

    public TMS(KnowledgeBase kb) {
        this.kb = kb;
    }

    public void addFactWithCheck(Proposition fact) {
        if (kbContainsContradiction(fact)) {
            System.out.println("Contradiction detected: " + fact);
            return;
        }
        kb.addFact(fact);
    }

    private boolean kbContainsContradiction(Proposition fact) {
        // Implementation of logic
        return false;
    }
}

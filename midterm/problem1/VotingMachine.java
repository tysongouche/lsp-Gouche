package org.howard.edu.lsp.midterm.problem1;
import java.util.ArrayList;

public class VotingMachine {
    ArrayList<Object> candidate_list_votes = new ArrayList<Object>();
    Integer total_votes = 0;

    /**
     * @Void
     * Adds a candidate to the list
     */
    public void addCandidate(String name) {
        candidate_list_votes.add(name);        //Add a candidate, then add the votes on the index to the right
        candidate_list_votes.add(0);           //This way, candidates will always precede their votes by 1 index
    }

    /**
     * @Parameters name of candidate, # of votes
     * Casts a certain number of votes for a specific candidate
     */
    public void castVotes(String name, int votes) {
        for (int i = 0; i < candidate_list_votes.size(); i++) {
            if (candidate_list_votes.get(i) == name) {
                candidate_list_votes.add(i+1,votes);
                total_votes += votes;
            }
        }
    }

    /**
     * @Parameters name of candidate
     * @Returns the # of votes for a candidate; Throws a UnknownCandidateException if candidate does not exist
     */
    public int getVotes(String names)  throws UnknownCandidateException {
        for (int i = 0; i < candidate_list_votes.size(); i++) {
            if (candidate_list_votes.get(i) == names) {
                return (Integer) candidate_list_votes.get(i+1);
            }
        }
        return 0;
    }

    /**
     *
     * @Returns the total # of votes across all candidates
     */
    public int sum() {
        return total_votes;
    }

    static class UnknownCandidateException extends Exception {
        public UnknownCandidateException()
        {
            super("UnknownCandidateException");
        }
    }
}

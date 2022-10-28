package org.howard.edu.lsp.midterm.problem1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VotingJUnitTest {
    @Test
    @DisplayName("Test Case for getVotes() Method")
    void TestGetVotes () throws VotingMachine.UnknownCandidateException {
        VotingMachine voter = new VotingMachine();
        voter.addCandidate("Tyson Gouché");
        voter.addCandidate("Professor Woolfolk");
        voter.addCandidate("The bees knees");
        voter.castVotes("Tyson Gouché",7);
        voter.castVotes("Professor Woolfolk", 10);
        voter.castVotes("The bees knees", 9);
        assertEquals(voter.getVotes("Tyson Gouché"), 7);
        assertEquals(voter.getVotes("Professor Woolfolk"), 10);
        assertTrue(voter.getVotes("The bees knees") == 9);
    }

    @Test
    @DisplayName("Test Case for sum() Method")
    void TestSum () throws VotingMachine.UnknownCandidateException {
        VotingMachine voter = new VotingMachine();
        voter.addCandidate("Tyson Gouché");
        voter.addCandidate("Professor Woolfolk");
        voter.addCandidate("The bees knees");
        voter.castVotes("Tyson Gouché",7);
        voter.castVotes("Professor Woolfolk", 10);
        voter.castVotes("The bees knees", 9);
        assertEquals(voter.sum(), 26);
    }
}

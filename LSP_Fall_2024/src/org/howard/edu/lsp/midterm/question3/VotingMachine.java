package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

public class VotingMachine {
    private HashMap<String, Integer> candidates = new HashMap<>();

    // Add a candidate with the name to the list
    public void addCandidate(String name) {
        candidates.put(name, 0);
    }

    // Cast a vote to the candidate with the name
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate not found!");
        }
    }

    // Return a string that prints out the number of votes each candidate has received
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String candidate : candidates.keySet()) {
            result.append(candidate).append(": ").append(candidates.get(candidate)).append(" votes\n");
        }
        return result.toString();
    }
}

// Driver to test the VotingMachine class
class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        
        // Adding candidates
        vm.addCandidate("Alsobrooks");
        vm.addCandidate("Hogan");

        // Casting votes
        vm.castVote("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.castVote("Hogan");

        // Printing results
        System.out.println(vm.toString());
    }
}
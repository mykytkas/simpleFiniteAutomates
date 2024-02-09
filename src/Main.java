public class Main {


    public static void main(String[] args) {
        // an example of a finite automaton
        FiniteAutomata nfa = new NondeterministicFiniteAutomata();
        //vertices are added with addVertex()
        nfa.addVertex(true, false, "a");
        nfa.addVertex(false, false, "b");
        nfa.addVertex(false, false, "c");
        nfa.addVertex(false, false, "d");
        nfa.addVertex(false, true, "e");
        //vertices are accessed with getVertexById()
        //edges are added with addEdge()
        nfa.getVertexById(0).addEdge(1, "01");
        nfa.getVertexById(0).addEdge(3, new char[]{'0','5'});

        nfa.getVertexById(1).addEdge(2, new char[]{'0','1'});
        nfa.getVertexById(1).addEdge(3, new char[]{'6','3'});
        nfa.getVertexById(1).addEdge(4, '0');

        nfa.getVertexById(2).addEdge(4, '0');

        nfa.getVertexById(3).addEdge(0, '4');
        nfa.getVertexById(3).addEdge(4, '4');
        nfa.getVertexById(3).addEdge(1, new char[]{'0','3'});

        //the most important method of the programm - isAcceptableString()
        //checks if the given input String could be accepted in the given automaton
        System.out.println(nfa.isAcceptableString("034530"));
    }
}
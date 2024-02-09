public class Main {


    public static void main(String[] args) {

        FiniteAutomata nea = new NondeterministicFiniteAutomata();
        nea.addVertex(true, false, "a");
        nea.addVertex(false, false, "b");
        nea.addVertex(false, false, "c");
        nea.addVertex(false, false, "d");
        nea.addVertex(false, true, "e");

        nea.getVertexById(0).addEdge(1, new char[]{'0','1'});
        nea.getVertexById(0).addEdge(3, new char[]{'0','5'});

        nea.getVertexById(1).addEdge(2, new char[]{'0','1'});
        nea.getVertexById(1).addEdge(3, new char[]{'6','3'});
        nea.getVertexById(1).addEdge(4, '0');

        nea.getVertexById(2).addEdge(4, '0');

        nea.getVertexById(3).addEdge(0, '4');
        nea.getVertexById(3).addEdge(4, '4');
        nea.getVertexById(3).addEdge(1, new char[]{'0','3'});


        System.out.println(nea.isAcceptableString("034530"));
    }
}
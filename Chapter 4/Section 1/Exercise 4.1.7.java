import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import util.Constants;

public class Exercise7 {
    public static void main(String[] args) {
        String filePath = Constants.FILES_PATH + args[0];
        Graph graph = new Graph(new In(filePath));
        StdOut.println(graph);
    }

}

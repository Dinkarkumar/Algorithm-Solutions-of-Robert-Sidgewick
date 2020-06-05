public class Graph{
  private final int V;
  private int E;
  private Bag<Integer>[] adj;
  public Graph(Graph G){
    this.V = G.V;
    this.E = G.E;
    adj = new Bag<Integer>[G.V]; //create array of lists
    for(int i = 0;i<G.V;i++){
      this.adj[i] = new Bag<Integer>();
      for(int x :G.adj[i]){
        this.adj[i].add(x);
      }
    }
  }
}

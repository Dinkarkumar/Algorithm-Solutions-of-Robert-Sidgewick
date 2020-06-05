public class Graph{
  private final int V;
  private int E;
  private Bag<Integer>[] adj;
  
  public Graph(int V){
    this.V = V;
    adj = (Bag<Integer>[]) new Bag[V];
    for(int v = 0;v<V;v++){
      adj[v] = new Bag<Integer>();
     }
  }
  public Graph(In in){
    this(in.readInt());     //read V and construct this Graph
    int E = in.readInt();   // Read E
    for(int i = 0;i<E;i++){
      // Add an edge
      int v = in.readInt();   //read a vertex
      int w = in.readInt();   //read another vertex
      addEdge(v,w);
    }
  }
  public int V(){
    return V;
  }
  public int E(){
    return E;
  }
  public void addEdge(int v,int w){
    add[v].add(w);
    add[w].add(v);
    E++;
  }
  public Iterable<Integer> adj(int v){
     return adj[v];
  }
}

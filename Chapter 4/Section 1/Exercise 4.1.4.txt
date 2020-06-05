public class GraphWithHasEdge extends Graph{
  public boolean hasEdge(int v,int w){
    for(int x:adj[v]){
      if(x==w)
        return true;
    }
    return false;
  }
}

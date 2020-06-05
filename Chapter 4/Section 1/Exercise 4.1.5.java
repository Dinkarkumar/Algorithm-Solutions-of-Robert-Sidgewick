public class GraphWithNoParallelEdgesAndSelfLoops extends Graph{
    public void addEdge(int v,int w){
      super.addEdge();    //invokes the super class methood
      if(!hasEdge(v,w)&&v!=w){
        adj[v].add(w);
        adj[w].add(v);
      }
    }
    public boolean hasEdge(int v,int w){
      for(int x:adj[v]){
        if(x==w)
          return true;
       }
       return false;
    }
}

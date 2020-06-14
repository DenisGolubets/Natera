package com.natera.commons.graph;


import com.natera.commons.graph.api.Graph;
import com.natera.commons.graph.api.GraphManager;
import com.natera.commons.graph.api.GraphType;
import com.natera.commons.graph.manager.GraphManagerFactory;

public abstract class AbstractGraph<V> implements Graph<V> {

  private GraphType type;
  private GraphManager<V> graphManager;


  public AbstractGraph(GraphType type) {
    this.type = type;
    graphManager = GraphManagerFactory.getManagerByType(type);
  }

  @Override
  public void addVertex(V vertex) {
    if (vertex == null) {
      throw new NullPointerException("Vertex can be null");
    }
    graphManager.addVertex(vertex);
  }

  @Override
  public void addEdge(V sourceVertex, V targetVertex) {
    graphManager.addEdge(sourceVertex, targetVertex);
  }
}

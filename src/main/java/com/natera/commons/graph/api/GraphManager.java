package com.natera.commons.graph.api;

public interface GraphManager<V> {

  /**
   * Add a new vertex in this graph and returns true - if vertex added, and false if not.
   */
  void addVertex(V vertex);

  /**
   * Adds the edge to the adjacency edge it absent
   *
   * @param sourceVertex the source vertex
   * @param targetVertex the target vertex
   * @return true if the edge was added, false otherwise
   */
  void addEdge(V sourceVertex, V targetVertex);

}

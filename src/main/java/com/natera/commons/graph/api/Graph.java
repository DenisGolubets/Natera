package com.natera.commons.graph.api;

public interface Graph<V> {


  /**
   * Add a new vertex in this graph.
   *
   * @param vertex - vertex to be added to this graph
   */
  void addVertex(V vertex);

  /**
   * Creates a new edge in this graph.
   *
   * @param sourceVertex source vertex of the edge.
   * @param targetVertex target vertex of the edge.
   */
  void addEdge(V sourceVertex, V targetVertex);
}

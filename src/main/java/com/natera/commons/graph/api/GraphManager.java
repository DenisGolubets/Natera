package com.natera.commons.graph.api;

import java.util.List;

public interface GraphManager<V> {

  /**
   * Add a new vertex in this graph
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

  /**
   * Get the adjacent vertices of a particular vertex
   *
   * @param vertex vertex
   * @return if between 2 vertices have no adjacent vertices return empty list or list of adjacent
   */
  List<V> getAdjVertices(V vertex);

}

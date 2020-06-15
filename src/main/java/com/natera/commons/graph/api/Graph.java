package com.natera.commons.graph.api;

import java.util.List;

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

  /**
   * Get a list of adjacent between 2 vertices
   *
   * @param start start vertices
   * @param end end vertices
   * @return if between 2 vertices have no adjacent return empty list or adjacent list
   */
  List<V> getPath(V start, V end);
}

package com.natera.commons.graph.api;

import java.util.Set;

public interface Graph<V, E> {


  /**
   * Creates a new vertex in this graph and returns it.
   */
  V addVertex();

  /**
   * Creates a new edge in this graph, and returns the created edge.
   *
   * @param sourceVertex source vertex of the edge.
   * @param targetVertex target vertex of the edge.
   */
  E addEdge(V sourceVertex, V targetVertex);

  /**
   * Returns a set of the vertices contained in this graph.
   *
   * @return see description
   */
  Set<V> vertexSet();

  /**
   * Returns a set of the edges contained in this graph.
   *
   * @return see description
   */
  Set<E> edgeSet();
}

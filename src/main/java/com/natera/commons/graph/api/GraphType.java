package com.natera.commons.graph.api;

public interface GraphType {

  /**
   * Returns true if all edges of the graph are directed, false otherwise.
   *
   * @return see description
   */
  boolean isDirected();

  /**
   * Returns true if all edges of the graph are undirected, false otherwise.
   *
   * @return see description
   */
  boolean isUndirected();
}

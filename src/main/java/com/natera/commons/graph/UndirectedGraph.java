package com.natera.commons.graph;

/**
 * The implementation of a undirected graph.
 *
 * @param <V> the graph vertex type
 */
public class UndirectedGraph<V> extends AbstractGraph<V> {

  public UndirectedGraph() {
    super(new BaseGraphType.Builder().undirected().build());
  }
}

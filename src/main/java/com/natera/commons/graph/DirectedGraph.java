package com.natera.commons.graph;


/**
 * The implementation of a directed graph.
 *
 * @param <V> the graph vertex type
 */
public class DirectedGraph<V> extends AbstractGraph<V> {

  public DirectedGraph() {
    super(new BaseGraphType.Builder().directed().build());
  }
}

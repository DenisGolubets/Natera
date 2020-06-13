package com.natera.commons.graph;


import com.natera.commons.graph.api.GraphType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class BaseAbstractGraph<V, E> extends AbstractGraph {

  private GraphType type;
  private HashMap<V, Set<E>> adjacencyPairs;


  public BaseAbstractGraph(GraphType type, HashMap<V, Set<E>> adjacencyPairs) {
    this.type = type;
    this.adjacencyPairs = adjacencyPairs;
  }

  @Override
  public Set vertexSet() {
    return Collections.unmodifiableSet(adjacencyPairs.keySet());
  }

  @Override
  public Set edgeSet() {
    return Collections.unmodifiableSet(adjacencyPairs.values().stream()
        .flatMap(Set::stream)
        .collect(Collectors.toSet()));
  }
}

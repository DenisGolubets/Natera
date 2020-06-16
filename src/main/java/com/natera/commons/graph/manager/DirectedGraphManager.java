package com.natera.commons.graph.manager;

import com.natera.commons.graph.api.GraphManager;

import java.util.*;

public class DirectedGraphManager<V> implements GraphManager<V> {

  protected Map<V, List<V>> adjacencyPairs;

  public DirectedGraphManager() {
    adjacencyPairs = new HashMap<>();
  }

  @Override
  public void addVertex(V vertex) {
    adjacencyPairs.computeIfAbsent(vertex, k -> new LinkedList<>());
  }

  @Override
  public void addEdge(V sourceVertex, V targetVertex) {
    adjacencyPairs.computeIfAbsent(sourceVertex, k -> new LinkedList<>());
    adjacencyPairs.get(sourceVertex).add(targetVertex);
  }

  @Override
  public List<V> getAdjVertices(V vertex) {
    List<V> result = adjacencyPairs.get(vertex);
    return result == null ? Collections.emptyList() : result;
  }
}

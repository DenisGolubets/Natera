package com.natera.commons.graph.manager;

import com.natera.commons.graph.api.GraphManager;

import java.util.*;

public class UndirectedGraphManager<V> implements GraphManager<V> {

  private Map<V, List<V>> adjacencyPairs;

  public UndirectedGraphManager() {
    adjacencyPairs = new HashMap<>();
  }

  @Override
  public void addVertex(V vertex) {
    adjacencyPairs.computeIfAbsent(vertex, k -> new LinkedList<>());
  }

  @Override
  public void addEdge(V sourceVertex, V targetVertex) {
    adjacencyPairs.computeIfAbsent(sourceVertex, k -> new LinkedList<>());
    adjacencyPairs.computeIfAbsent(targetVertex, k -> new LinkedList<>());

    adjacencyPairs.get(sourceVertex).add(targetVertex);
    adjacencyPairs.get(targetVertex).add(sourceVertex);
  }

  @Override
  public List<V> getAdjVertices(V vertex) {
    List<V> result = adjacencyPairs.get(vertex);
    return result == null ? Collections.emptyList() : result;
  }
}

package com.natera.commons.graph.manager;

import com.natera.commons.graph.api.GraphManager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
  }
}

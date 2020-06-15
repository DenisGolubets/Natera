package com.natera.commons.graph;


import com.natera.commons.graph.api.Graph;
import com.natera.commons.graph.api.GraphManager;
import com.natera.commons.graph.api.GraphType;
import com.natera.commons.graph.manager.GraphManagerFactory;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractGraph<V> implements Graph<V> {

  private final GraphType type;
  private final GraphManager<V> graphManager;


  public AbstractGraph(GraphType type) {
    this.type = type;
    graphManager = GraphManagerFactory.getManagerByType(type);
  }

  @Override
  public void addVertex(V vertex) {
    if (vertex == null) {
      throw new NullPointerException("Vertex can be null");
    }
    graphManager.addVertex(vertex);
  }

  @Override
  public void addEdge(V sourceVertex, V targetVertex) {
    graphManager.addEdge(sourceVertex, targetVertex);
  }

  @Override
  public List<V> getPath(V start, V end) {
    LinkedList<V> visited = new LinkedList<>();
    visited.add(start);
    return getPath(visited, end);
  }

  private List<V> getPath(LinkedList<V> visitedNodes, V end) {
    List<V> adjacent = graphManager.getAdjVertices(visitedNodes.getLast());
    if (adjacent != null) {
      for (V node : adjacent) {
        if (visitedNodes.contains(node)) {
          continue;
        }
        if (node.equals(end)) {
          visitedNodes.add(node);
          return visitedNodes;
        }
        visitedNodes.add(node);
        getPath(visitedNodes, end);
        if (visitedNodes.contains(end)) {
          return visitedNodes;
        }
        visitedNodes.removeLast();
      }
    }
    return Collections.emptyList();
  }

  public GraphType getType() {
    return type;
  }
}

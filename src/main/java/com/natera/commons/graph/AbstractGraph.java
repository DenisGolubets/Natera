package com.natera.commons.graph;

import com.natera.commons.graph.api.Graph;

public abstract class AbstractGraph<V, E> implements Graph {


  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if ((obj == null) || (getClass() != obj.getClass())) {
      return false;
    }

    @SuppressWarnings("unchecked")
    AbstractGraph g = (AbstractGraph) obj;

    if (!vertexSet().equals(g.vertexSet())) {
      return false;
    }
    if (edgeSet().size() != g.edgeSet().size()) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int vertexHash = 31 * vertexSet().hashCode();
    int edgesHash = 31 * edgeSet().hashCode();
    for (Object o : edgeSet()) {
      edgesHash = 31 * o.hashCode();
    }

    return vertexHash + edgesHash;
  }
}

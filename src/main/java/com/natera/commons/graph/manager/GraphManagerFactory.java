package com.natera.commons.graph.manager;

import com.natera.commons.graph.api.GraphManager;
import com.natera.commons.graph.api.GraphType;

public final class GraphManagerFactory {

  public static GraphManager getManagerByType(GraphType graphType) {
    if (graphType == null) {
      throw new NullPointerException("Graph type must by not null");
    }
    if (graphType.isDirected()) {
      return new DirectedGraphManager();
    }
    if (graphType.isUndirected()) {
      return new UndirectedGraphManager();
    }

    throw new UnsupportedOperationException(
        String.format("Graph type: %s not supported", graphType));
  }

}

package com.natera.commons.graph.manager;

import com.natera.commons.graph.BaseGraphType;
import com.natera.commons.graph.api.GraphManager;
import com.natera.commons.graph.api.GraphType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphManagerFactoryTest {

  @Test
  public void getDirectedManagerByType() {
    GraphType graphType = new BaseGraphType.Builder().directed().build();
    GraphManager managerByType = GraphManagerFactory.getManagerByType(graphType);
    assertEquals(DirectedGraphManager.class, managerByType.getClass());
  }

  @Test
  public void getUndirectedManagerByType() {
    GraphType graphType = new BaseGraphType.Builder().undirected().build();
    GraphManager managerByType = GraphManagerFactory.getManagerByType(graphType);
    assertEquals(UndirectedGraphManager.class, managerByType.getClass());
  }

  @Test(expected = NullPointerException.class)
  public void getManagerByTypeNPE() {
    GraphManagerFactory.getManagerByType(null);
  }
}
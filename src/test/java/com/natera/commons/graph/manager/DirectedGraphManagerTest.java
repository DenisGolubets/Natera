package com.natera.commons.graph.manager;

import org.junit.Test;

import java.util.LinkedList;

import static java.util.Collections.emptyList;
import static junit.framework.Assert.assertEquals;

public class DirectedGraphManagerTest {

  private final String v1 = "v1";
  private final String v2 = "v2";
  private final String v3 = "v3";

  @Test
  public void addVertex() {
    DirectedGraphManager<String> manager = new DirectedGraphManager<>();
    manager.addVertex(v1);
    assertEquals(1, manager.adjacencyPairs.size());
  }

  @Test
  public void addEdge() {
    DirectedGraphManager<String> manager = new DirectedGraphManager<>();
    manager.addVertex(v1);
    manager.addEdge(v1, v2);
    assertEquals(1, manager.getAdjVertices(v1).size());
  }

  @Test
  public void getAdjVerticesWithoutEdges() {
    DirectedGraphManager<String> manager = new DirectedGraphManager<>();
    manager.addVertex(v1);
    manager.addEdge(v2, v3);

    assertEquals(emptyList(), manager.getAdjVertices(v1));
    assertEquals(2, manager.adjacencyPairs.size());
  }

  @Test
  public void getAdjVerticesWithEdges() {
    DirectedGraphManager<String> manager = new DirectedGraphManager<>();
    manager.addEdge(v2, v3);
    manager.addEdge(v2, v1);

    assertEquals(emptyList(), manager.getAdjVertices(v1));
    LinkedList<String> strings = new LinkedList<>();

    strings.add(v3);
    strings.add(v1);
    assertEquals(strings.toString(), manager.getAdjVertices(v2).toString());
    assertEquals(1, manager.adjacencyPairs.size());
  }
}
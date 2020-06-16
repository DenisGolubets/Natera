package com.natera.commons.graph.manager;

import org.junit.Test;

import java.util.LinkedList;

import static junit.framework.Assert.assertEquals;

public class UndirectedGraphManagerTest {

  private final String v1 = "v1";
  private final String v2 = "v2";
  private final String v3 = "v3";

  @Test
  public void addVertex() {
    UndirectedGraphManager<String> manager = new UndirectedGraphManager<>();
    manager.addVertex(v1);
    manager.addVertex(v2);
    assertEquals(2, manager.adjacencyPairs.size());
  }

  @Test
  public void addEdge() {
    UndirectedGraphManager<String> manager = new UndirectedGraphManager<>();
    manager.addVertex(v1);
    manager.addEdge(v1, v2);
    assertEquals(2, manager.adjacencyPairs.size());
  }

  @Test
  public void getAdjVertices() {
    UndirectedGraphManager<String> manager = new UndirectedGraphManager<>();
    manager.addVertex(v1);
    manager.addEdge(v2, v3);
    LinkedList<String> strings = new LinkedList<>();

    strings.add(v3);
    assertEquals(3, manager.adjacencyPairs.size());
    assertEquals(strings.toString(), manager.getAdjVertices(v2).toString());
  }
}
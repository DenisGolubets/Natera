package com.natera.commons.graph;

import com.natera.commons.graph.api.Graph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Is test getting path between two vertex in Directed and Undirected graphs. Graphs struct in
 * pictures you can see in resources directory (resources/digraph, resources/udigraph)
 */
public class DirectedGraphTest {

  @Test
  public void testDirectedGraphPath() {
    Graph<String> graph = new DirectedGraph<>();
    graph.addEdge("4", "2");
    graph.addEdge("3", "2");
    graph.addEdge("6", "0");
    graph.addEdge("0", "1");
    graph.addEdge("2", "0");
    graph.addEdge("11", "12");
    graph.addEdge("12", "9");
    graph.addEdge("9", "10");
    graph.addEdge("9", "11");
    graph.addEdge("10", "12");
    graph.addEdge("11", "4");
    graph.addEdge("4", "3");
    graph.addEdge("3", "5");
    graph.addEdge("6", "8");
    graph.addEdge("8", "6");
    graph.addEdge("5", "4");
    graph.addEdge("0", "5");
    graph.addEdge("6", "4");
    graph.addEdge("6", "9");
    graph.addEdge("7", "6");

    assertEquals("[9, 11, 4, 2, 0, 1]", graph.getPath("9", "1").toString());
    assertEquals("[7, 6, 0, 5, 4, 2]", graph.getPath("7", "2").toString());
  }

  @Test
  public void testUndirectedGraphPath() {
    Graph<String> graph = new UndirectedGraph<>();
    graph.addEdge("0", "5");
    graph.addEdge("4", "3");
    graph.addEdge("0", "1");
    graph.addEdge("9", "12");
    graph.addEdge("6", "4");
    graph.addEdge("5", "4");
    graph.addEdge("0", "2");
    graph.addEdge("11", "12");
    graph.addEdge("9", "10");
    graph.addEdge("0", "6");
    graph.addEdge("7", "8");
    graph.addEdge("9", "11");
    graph.addEdge("5", "3");

    assertEquals("[4, 3, 5, 0, 1]", graph.getPath("4", "1").toString());
    assertEquals("[]", graph.getPath("7", "6").toString());
    assertEquals("[10, 9, 12]", graph.getPath("10", "12").toString());
  }
}
package com.natera.commons.graph;

import com.natera.commons.graph.api.GraphType;

public class BaseGraphType implements GraphType {

  private final boolean directed;
  private final boolean undirected;

  private BaseGraphType(boolean directed, boolean undirected) {
    this.directed = directed;
    this.undirected = undirected;
  }

  public boolean isDirected() {
    return directed;
  }

  public boolean isUndirected() {
    return undirected;
  }

  /**
   * Create a directed type
   *
   * @return A directed type
   */
  public BaseGraphType directed() {
    return new Builder().directed().build();
  }

  /**
   * Create a undirected type
   *
   * @return A undirected type
   */
  public BaseGraphType undirected() {
    return new Builder().undirected().build();
  }


  public static class Builder {

    private boolean directed;
    private boolean undirected;

    /**
     * Construct a new Builder.
     */
    public Builder() {
      this.directed = false;
      this.undirected = true;
    }

    /**
     * Construct a new Builder.
     *
     * @param directed   whether the graph contains directed edges
     * @param undirected whether the graph contains undirected edges
     */
    public Builder(boolean directed, boolean undirected) {
      if (!directed && !undirected || directed && undirected) {
        throw new IllegalArgumentException(
            "At least one of directed or undirected must be true");
      }
      this.directed = directed;
      this.undirected = undirected;
    }

    /**
     * Set the type as directed.
     *
     * @return the builder
     */
    public Builder directed() {
      this.directed = true;
      this.undirected = false;
      return this;
    }

    /**
     * Set the type as undirected.
     *
     * @return the builder
     */
    public Builder undirected() {
      this.directed = false;
      this.undirected = true;
      return this;
    }

    public BaseGraphType build() {
      return new BaseGraphType(directed, undirected);
    }
  }

}

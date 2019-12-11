package io.github.hoschi_it.NetworkAnalysis.logic;

import io.github.hoschi_it.NetworkAnalysis.data.*;

public class Centralities
{
    private IGraph _graph;
    private InnerDegreeCalculator _innerDegreeCalculator;
    private ClosenessCalculator _closenessCalculator;

    public Centralities(IGraph graph){
        _graph = graph;
        _innerDegreeCalculator = new InnerDegreeCalculator(_graph.getAdjacenzMatrix());
        _closenessCalculator = new ClosenessCalculator(_graph);
    }

    /**
     * Calculate for every node
     * - Inner Degree
     * - Betweenness Centrality
     * - Closeness Centrality
     *
     * Save those values in the node objects
     */
    public void doMath(){
        calcAndCacheInnerDegrees();
    }

    private void calcAndCacheInnerDegrees(){
        Node[] nodes = _graph.getNodes();
        _innerDegreeCalculator.calcAndCacheInnerDegree(nodes);
    }
}

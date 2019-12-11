package io.github.hoschi_it.NetworkAnalysis.logic;

import io.github.hoschi_it.NetworkAnalysis.data.AdjacenzMatrix;
import io.github.hoschi_it.NetworkAnalysis.data.Node;

public class InnerDegreeCalculator
{
    private AdjacenzMatrix _adjacentMatrix;

    public InnerDegreeCalculator(AdjacenzMatrix adjacentMatrix){
        _adjacentMatrix = adjacentMatrix;
    }

    public void calcAndCacheInnerDegree(Node[] nodes)
    {
        int nodeCount = _adjacentMatrix.getColumnCount();
        for (int nodeIndex = 0; nodeIndex < nodeCount; nodeIndex++)
        {
            Node node = nodes[nodeIndex];
            calcAndCacheInnerDegree(node);
        }
    }

    public void calcAndCacheInnerDegree(Node node)
    {
        int degree = calculateInnerDegree(node);
        node.setInnerDegree(degree);
    }

    private int calculateInnerDegree(Node node)
    {
        int id = node.getId();
        int numOfRows = _adjacentMatrix.getRowCount();

        int innerDegree = 0;
        for (int i = 0; i < numOfRows; i++)
        {
            if (_adjacentMatrix.getCell(i, id) > 0)
            {
                innerDegree += 1;
            }
        }
        return innerDegree;
    }
}

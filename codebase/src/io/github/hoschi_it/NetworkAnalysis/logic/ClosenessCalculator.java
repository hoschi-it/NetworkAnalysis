package io.github.hoschi_it.NetworkAnalysis.logic;

import io.github.hoschi_it.NetworkAnalysis.data.AdjacenzMatrix;
import io.github.hoschi_it.NetworkAnalysis.data.IGraph;
import io.github.hoschi_it.NetworkAnalysis.data.Node;

import java.util.List;

public class ClosenessCalculator
{
    private IGraph _graph;

    public ClosenessCalculator(IGraph graph)
    {
        _graph = graph;
    }

    public void doStuff()
    {
        Node[] nodes = _graph.getNodes();

        for (Node n : nodes)
        {
            calcAndCache(n);
        }
    }

    private void calcAndCache(Node n){
        float closeness = calc(n);
        n.setClosenes(closeness);
    }

    private float calc(Node n)
    {
        List<List<Node>> shortestWays = _graph.getShortestWays();
        float overallCloseness = 0;

        for(int i = 0; i < shortestWays.size(); i++){
            Node startNode = shortestWays.get(i).get(0);

            if(startNode.getId() == n.getId()){
                float singleDistance = calcDistance(shortestWays.get(i));
                overallCloseness += 1.0 / singleDistance;
            }
        }
        return overallCloseness;
    }

    private int calcDistance(List<Node> way)
    {
        int distance = 0;

        if(way.size()> 1)
        {
            AdjacenzMatrix adjacenzMatrix = _graph.getAdjacenzMatrix();
            Node lastNode = way.get(0);

            for(int i = 0; i < way.size(); i++){
                Node node = way.get(i);
                int singleDist = adjacenzMatrix.getCell(
                        lastNode.getId(),
                        node.getId()
                );
                distance += singleDist;
                lastNode = way.get(i);
            }
        }
        return distance;
    }


}

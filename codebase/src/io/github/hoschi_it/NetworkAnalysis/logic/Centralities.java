package io.github.hoschi_it.NetworkAnalysis.logic;

import io.github.hoschi_it.NetworkAnalysis.data.*;

import java.util.ArrayList;

public class Centralities
{
    public void calculateInnerDegrees(Graph graph){
        ArrayList<Integer> innerDegrees = new ArrayList<>();

        for(int id: graph.getNodeIds()){
            Node node = graph.getNodeById(id);
            int degree = graph.getConnectionsTo(id).size();
            node.setInnerDegree(degree);
        }
    }
}

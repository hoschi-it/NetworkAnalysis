package io.github.hoschi_it.NetworkAnalysis.logic;


import io.github.hoschi_it.NetworkAnalysis.data.Graph;

import java.util.ArrayList;

public class Centralities
{
    public ArrayList<Integer> calculateInnerDegrees(Graph graph){
        ArrayList<Integer> innerDegrees = new ArrayList<>();

        for(int id: graph.getNodeIds()){
            int degree = graph.getConnectionsTo(id).size();
            innerDegrees.add(degree);
        }

        return innerDegrees;
    }
}

package io.github.hoschi_it.NetworkAnalysis.data;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Graph
{
    private ArrayList<Node> _nodes;
    private ArrayList<Connection> _connections;

    public ArrayList<Integer> getNodeIds(){
        ArrayList<Integer> ids = new ArrayList<>();

        for(int i = 0; i < _nodes.size(); i++){
            ids.add(i);
        }
        return  ids;
    }

    public ArrayList<Connection> getConnectionsTo(int id){
        return getConnections(id, false);
    }

    public ArrayList<Connection> getConnectionsFrom(int id){
        return getConnections(id, true);
    }

    @NotNull
    private ArrayList<Connection> getConnections(int id, boolean from){
        ArrayList<Connection> connections = new ArrayList<>();
        for(Connection c: _connections){
            if((from ? c.getFromNodeId() : c.getToNodeId()) == id){
                connections.add(c);
            }
        }
        return connections;
    }

    public ArrayList<Integer> getInnerDegrees(){
        ArrayList<Integer> innerDegrees = new ArrayList<>();

        for(Node node: _nodes){
            int d = node.getInnerDegree();
            innerDegrees.add(d);
        }
        return innerDegrees;
    }

    @Contract(pure = true)
    public Node getNodeById(int id){
        return _nodes.get(id);
    }

    public void addNode(Node node){
        _nodes.add(node);
    }

}

package io.github.hoschi_it.NetworkAnalysis.data;

/**
 * Directional connection between two nodes in a Graph
 */
public class Connection
{
    private int _fromNodeId;
    private int _toNodeId;
    private float _weight;

    public Connection(int fromNodeId, int toNodeId, float weight){
        _fromNodeId = fromNodeId;
        _toNodeId = toNodeId;
        _weight = weight;
    }

    public int getFromNodeId()
    {
        return _fromNodeId;
    }

    public int getToNodeId()
    {
        return _toNodeId;
    }

    public float getWeight()
    {
        return _weight;
    }
}

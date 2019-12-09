package io.github.hoschi_it.NetworkAnalysis.data;

public class Node
{
    private int _innerDegree;
    private float _betweennes;
    private int _closenes;

    public void setInnerDegree(int innerDegree){
        _innerDegree = innerDegree;
    }

    public void setBetweennes(float betweennes)
    {
        _betweennes = betweennes;
    }

    public void setClosenes(int closenes)
    {
        _closenes = closenes;
    }

    public int getInnerDegree()
    {
        return _innerDegree;
    }

    public float getBetweennes()
    {
        return _betweennes;
    }

    public int getClosenes()
    {
        return _closenes;
    }
}

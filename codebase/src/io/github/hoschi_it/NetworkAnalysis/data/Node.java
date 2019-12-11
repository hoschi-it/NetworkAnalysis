package io.github.hoschi_it.NetworkAnalysis.data;

public class Node
{
    private int _innerDegree;
    private float _betweennes;
    private float _closenes;
    private int _id;

    public void setInnerDegree(int innerDegree){
        _innerDegree = innerDegree;
    }

    public void setBetweennes(float betweennes)
    {
        _betweennes = betweennes;
    }

    public void setClosenes(float closenes)
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

    public float getClosenes()
    {
        return _closenes;
    }

    public int getId()
    {
        return _id;
    }

    public void setId(int id)
    {
        _id = id;
    }
}

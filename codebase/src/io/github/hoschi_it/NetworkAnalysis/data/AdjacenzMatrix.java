package io.github.hoschi_it.NetworkAnalysis.data;

import java.util.List;

public class AdjacenzMatrix {

    private List<Integer[]> matrix;
    private int columnCount;
    private int rowCount;

    public int getColumnCount() {
        return columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public List<Integer[]> getMatrix(){
        return this.matrix;
    }

    public AdjacenzMatrix() {}

    public AdjacenzMatrix(List<Integer[]> matrix) {
        this.matrix = matrix;
        this.columnCount = matrix.get(0).length;
        this.rowCount = matrix.size();
    }

}



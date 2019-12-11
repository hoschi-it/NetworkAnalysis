package io.github.hoschi_it.NetworkAnalysis.data;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class AdjacenzMatrix {

	private List<Integer[]> matrix;
	private int _columnCount;
	private int _rowCount;
	
	public int getColumnCount() {
		return _columnCount;
	}

	public int getRowCount() {
		return _rowCount;
	}

	public int getCell(int from, int to){
		return matrix.get(from)[to];
	}

	public List<Integer[]> getMatrix(){
		return this.matrix;
	}
	
	public AdjacenzMatrix() {}
	
	private void ignoreDiagonals() {
		for(int i = 0; i < matrix.size(); i++)
			for(int j=0; j < matrix.get(i).length; j++)
				if(i == j)
					matrix.get(i)[j] = 0;
	}
	
	public AdjacenzMatrix(List<Integer[]> matrix) {
		this.matrix = matrix;
		this._columnCount = matrix.get(0).length;
		this._rowCount = matrix.size();
		
		ignoreDiagonals();
	}
}


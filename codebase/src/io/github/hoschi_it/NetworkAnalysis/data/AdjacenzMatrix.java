package io.github.hoschi_it.NetworkAnalysis.data;

import java.util.List;

public class Adjazenzmatrix {

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
	
	public Adjazenzmatrix() {}
	
	private void ignoreDiagonals() {
		for(int i = 0; i < matrix.size; i++)
			for(int j=0; j < matrix.get(i).length; j++)
				if(i == j)
					matrix.get(i)[j] = 0;
	}
	
	public Adjazenzmatrix(List<Integer[]> matrix) {
		this.matrix = matrix;
		this.columnCount = matrix.get(0).length;
		this.rowCount = matrix.size();
		
		ignoreDiagonals();
	}	
}


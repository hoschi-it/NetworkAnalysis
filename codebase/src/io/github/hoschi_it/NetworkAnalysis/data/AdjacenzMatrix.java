package io.github.hoschi_it.NetworkAnalysis.data;

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
	
	public Adjazenzmatrix(List<Integer[]> matrix) {
		this.matrix = matrix;
		this.columnCount = matrix.get(0).length;
		this.rowCount = matrix.size();
	}
	
}


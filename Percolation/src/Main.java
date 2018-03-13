public class Main {

    public static void main(String[] args) {
	// write your code here
        Percolation a = new Percolation(10);
        System.out.print(a.numberOfOpenSites());
    }
}
class Percolation {
    public Percolation(int n){
        boolean matrix[][]  = new boolean[n][n];
    }                // create n-by-n grid, with all sites blocked
    public    void open(int row, int col){

    }    // open site (row, col) if it is not open already
    public boolean isOpen(int row, int col){
        return true;

    } // is site (row, col) open?
    public boolean isFull(int row, int col){
        return true;
    } // is site (row, col) full?
    public     int numberOfOpenSites(){
        return 0;
    }      // number of open sites
    public boolean percolates(){
        return true;
    }             // does the system percolate?

    public static void main(String[] args){

    }  // test client (optional)
}

public class Crossword {
private Square[][] puzzle;

public Crossword (boolean[][] blackSquares) {
	int count = 1;
	for(int i = 0; i<blackSquares.length; i++) {
		for(int k = 0; k<blackSquares[i].length; k++) {
			if(blackSquares[i][k])
				puzzle[i][k] = new Square(true, 0);
			else if(!blackSquares[i][k] && toBeLabeled(i,k,blackSquares)) {
				puzzle[i][k] = new Square(false, count);
				count +=1;
			}
			else
				puzzle[i][k] = new Square(false, 0);
		}
	}
}

public boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
	if(!blackSquares[r][c] && (blackSquares[r-1][c] || blackSquares[r][c-1])) {
		return true;
	}
	return false;
}
}

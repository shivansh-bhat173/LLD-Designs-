package LLDDesigns.Designs.TicTacToe;
import LLDDesigns.Designs.TicTacToe.playingPiece;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    playingPiece[][] board;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public playingPiece[][] getBoard() {
        return board;
    }

    public void setBoard(playingPiece[][] board) {
        this.board = board;
    }

    Board(int size) {
        this.size = size;
        board = new playingPiece[size][size];

    }

    public void printBoard() {

        for (int i = 0; i < size; i++){
            System.out.print(" |");
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    System.out.print(" |");
                }else{
                    if(board[i][j].getType()== pieceType.X){
                        System.out.print("X|");
                    }else{
                        System.out.print("Y|");
                    }
                }
            }
            System.out.println();
        }
    }

    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells = new ArrayList<Pair<Integer,Integer>>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    freeCells.add(new Pair<>(i,j));
                }
            }
        }
        return freeCells;
    }

    public boolean addPiece(int row, int col,playingPiece piece) throws IndexOutOfBoundsException{

        if(board[row][col]==null){
            board[row][col]=piece;
            return true;
        }else return false;
    }
}

package LLDDesigns.Designs.TicTacToe;

import LLDDesigns.Designs.TicTacToe.Player;
import kotlin.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    public void addPlayer(com.lti.HLD_LLD.LLDDesigns.Designs.TicTacToe.Player player) {
        players.add(player);
    }

    public void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Abhinav", new PieceX());

        Player player2 = new Player("Jaish", new PieceY());
        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner=true;

        while(noWinner){

            Player activePlayer = players.removeFirst();

            List<Pair<Integer, Integer>> freeSpaces =  gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }
            gameBoard.printBoard();

            System.out.println("It's your turn "+ activePlayer.getName()+" , enter the row and column: ");
            Scanner scn = new Scanner(System.in);
            String input = scn.nextLine();
            String[] values = input.split(",");
            int row = Integer.parseInt(values[0]);
            int col = Integer.parseInt(values[1]);
            try{
                boolean isPieceAdded = gameBoard.addPiece(row, col, activePlayer.getPiece());
                if(!isPieceAdded){
                    System.out.println("Piece cannot be added, try again");
                    players.addFirst(activePlayer);
                    continue;
                }else{
                    System.out.println("Piece added!");
                }
            }catch(Exception e){
                System.out.println("Row or Column is invalid");
                continue;
            }
            gameBoard.printBoard();
            boolean winner  = isThereWinner(row, col, activePlayer.getPiece());
            if(winner){
                System.out.println("Winner is..." +activePlayer);
                return activePlayer.name;
            }
            players.addLast(activePlayer);
        }

        System.out.println("Game is Tied ,BRos!!");
        return null;
    }

    public boolean isThereWinner(int row, int col, playingPiece piece ){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i = 0; i < gameBoard.getSize(); i++){
            if(gameBoard.getBoard()[row][i]!=piece){
                rowMatch = false;
                break;
            }
        }
        for(int i = 0; i < gameBoard.getSize(); i++){
            if(gameBoard.getBoard()[i][col]==piece){
                colMatch = false;
                break;
            }
        }

        for(int r = 0,c = 0;r<gameBoard.getSize();r++,c++){
            if(gameBoard.board[r][c]!=piece)diagonalMatch=false;
        }

        for(int r = 0,c = gameBoard.getSize()-1;r< gameBoard.getSize();r++,c--){
            if(gameBoard.board[r][c]!=piece)antiDiagonalMatch=false;
        }
//        System.out.println(diagonalMatch + ""+rowMatch + ""+colMatch+""+antiDiagonalMatch);
        if(rowMatch || colMatch || diagonalMatch || antiDiagonalMatch)return true;
        return false;
    }
}

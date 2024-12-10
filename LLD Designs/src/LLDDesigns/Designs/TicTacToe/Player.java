package LLDDesigns.Designs.TicTacToe;

public class Player {
    public String name;
    public playingPiece piece;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public playingPiece getPiece() {
        return piece;
    }

    public void setPiece(playingPiece piece) {
        this.piece = piece;
    }

    Player(String name, playingPiece piece){
        this.name = name;
        this.piece = piece;
    }


}

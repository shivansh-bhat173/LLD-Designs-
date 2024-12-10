package LLDDesigns.Designs.TicTacToe;

public class playingPiece {
    private pieceType type;
    playingPiece(pieceType type){
        this.type = type;
    }

    public pieceType getType() {
        return type;
    }

    public void setType(pieceType type) {
        this.type = type;
    }
}

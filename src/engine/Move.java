package engine;
public class Move{
    private int fromRow,fromCol;
    private int toRow,toCol;
    //
    public Move(int fromRow,int fromCol,int toRow, int to Col)){
        this.fromRow=fromRow;
        this.fromCol= fromCol;
        this.toRow= toRow;
        this.toCol= toCol;
    }
    public int getFromRow(){return fromRow;}
    public int getFromCol(){return fromCol;}
    public int getToRow(){return toRow;}
    public int getTOCol(){return toCol;}
}
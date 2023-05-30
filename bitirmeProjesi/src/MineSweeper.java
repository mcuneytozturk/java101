package bitirmeProjesi.src;

public class MineSweeper {
    int rowNumber;
    int colNumber;

    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    void run(int rowNumber, int colNumber){
        
    }

    boolean isMine(){
        return false;
    }

    String map(int rowNumber, int colNumber){
        int mineCount = rowNumber * colNumber / 4;
        String map[][] = new String[rowNumber][colNumber];
        for(int i = 0; i < mineCount; i++){
            
        }


    }

}

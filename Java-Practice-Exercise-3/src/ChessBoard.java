public class ChessBoard {
    public void printPattern (String[][] arr){
        String white = "WW|";
        String black = "BB|";

        for(int i=0; i<arr.length; i++){
            for (int j=0;j<arr[i].length;j++){
                if ((i+j)%2==0){
                    System.out.printf(white);
                }else
                    System.out.printf(black);
            }System.out.println();
        }

    }
    public static void main(String[] args){
        String[][] array = new String[8][8];
        ChessBoard x = new ChessBoard();
        x.printPattern(array);
    }
}

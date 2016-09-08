
import java.util.Scanner;

public class TicTacToeGame{
  public static void main(String[] args){
    
    Scanner keyboard = new Scanner(System.in);
    TicTacToe board = new TicTacToe();
    
    for(int x = 1; board.getStatus()== TicTacToe.IN_PROGRESS; x++){
      System.out.println("Enter the row and column of your move: ");
      int rowMove = keyboard.nextInt();
      int columnMove = keyboard.nextInt();
      
      //checks to see if move is in legal location
      while(rowMove < 0 || rowMove > 2 || columnMove < 0 ||columnMove > 2){
        System.out.println("ILLEGAL LOCATION!");
        System.out.println("Enter the row and column of your move: ");
        rowMove = keyboard.nextInt();
        columnMove = keyboard.nextInt();
      }
      
      //checks to see if location is empty
      while(board.isEmpty(rowMove, columnMove) == false){
        System.out.println("OCCUPIED!");
        System.out.println("Enter the row and column of your move: ");
        rowMove = keyboard.nextInt();
        columnMove = keyboard.nextInt();
      }
      
      //alternate X-moves and O-moves
      if(x%2 == 1)
        board.makeMove(Cell.X, rowMove, columnMove);
      else
        board.makeMove(Cell.O, rowMove, columnMove);
      System.out.println(board.toString());
      
      //Checks if game is won
      if(board.getStatus() == TicTacToe.X_WINS || board.getStatus() == TicTacToe.O_WINS ||
         board.getStatus() == TicTacToe.DRAW){
      if(board.getStatus() == TicTacToe.X_WINS)
        System.out.println("X WINS!");
      else if(board.moveCount() == 9 && board.getStatus() != TicTacToe.X_WINS && 
              board.getStatus() != TicTacToe.O_WINS)
                             System.out.println("DRAW!");
      else
        System.out.println("O WINS!");
      
      }
    }
  }
}
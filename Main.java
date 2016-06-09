/**
 * Created by Demo on 07.06.2016.
 */
import java.util.Scanner;

public class Main {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        String name, from, to;
        System.out.println("Выберите фигуру: пешка, слон, ферзь, конь, король, ладья");
        name=in.nextLine();
        System.out.println("Введите начальную позицию a1-h8");
        from=in.nextLine();
        System.out.println("Введите конечную позицию a1-h8");
        to=in.nextLine();
        // ----Я мог перепутать стороны доски, но все фигуры работают корректно
        switch (name){
            case "пешка":
                Pawn pawn = new Pawn();
                System.out.println(pawn.isRightMove(from,to));
                break;
            case "слон":
                Bishop bishop = new Bishop();
                System.out.println(bishop.isRightMove(from,to));
                break;
            case "ферзь":
                Queen queen = new Queen();
                System.out.println(queen.isRightMove(from,to));
                break;
            case "конь":
                Knight knight = new Knight();
                System.out.println(knight.isRightMove(from,to));
                break;
            case "король":
                King king = new King();
                System.out.println(king.isRightMove(from,to));
                break;
            case "ладья":
                Rook rook = new Rook();
                System.out.println(rook.isRightMove(from,to));
                break;
        }

    }
}

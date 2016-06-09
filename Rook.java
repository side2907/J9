/**
 * Created by Demo on 07.06.2016.
 */
public class Rook  implements Figure {
    @Override
    public boolean isRightMove(String from, String to) {
        int fromX = s.strToNum(from);
        int fromY = s.numToNum(from);
        int toX = s.strToNum(to);
        int toY = s.numToNum(to);
        int x= fromX-toX;
        int y = fromY-toY;
        if(x==y||x==y*-1) return true;
        return false;
    }
}


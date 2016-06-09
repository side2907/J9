/**
 * Created by Demo on 07.06.2016.
 */
public class Pawn implements Figure  {
    @Override
    public boolean isRightMove(String from, String to) {
        int fromX = s.strToNum(from);
        int fromY = s.numToNum(from);
        int toX = s.strToNum(to);
        int toY = s.numToNum(to);
        if(fromX==7&&toX==5) return true;
        if(fromX-toX==1) return true;
        return false;
    }
}


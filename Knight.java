/**
 * Created by Demo on 07.06.2016.
 */
public class Knight implements Figure  {
    @Override
    public boolean isRightMove(String from, String to) {
        int fromX = s.strToNum(from);
        int fromY = s.numToNum(from);
        int toX = s.strToNum(to);
        int toY = s.numToNum(to);
        if(toX==fromX+2||toX==fromX-2||toY==fromY+2||toY==fromY-2){
            if(toX==fromX+1||toX==fromX-1||toY==fromY+1||toY==fromY-1) return true;
        }
        return false;
    }
}


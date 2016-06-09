/**
 * Created by Demo on 07.06.2016.
 */
public class Bishop implements Figure  {
    @Override
    public boolean isRightMove(String from, String to) {
        int fromX = s.strToNum(from);
        int fromY = s.numToNum(from);
        int toX = s.strToNum(to);
        int toY = s.numToNum(to);
        if(fromX==toX||fromY==toY){
            if(fromX==toX&&fromY==toY) return false;
            return true;
        }
        return false;
    }
}


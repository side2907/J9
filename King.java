/**
 * Created by Demo on 07.06.2016.
 */
public class King implements Figure {
    @Override
    public boolean isRightMove(String from, String to) {
        int fromX = s.strToNum(from);
        int fromY = s.numToNum(from);
        int toX = s.strToNum(to);
        int toY = s.numToNum(to);
        int x = fromX - toX;
        int y = fromY - toY;
        if(x>-2&&x<2&&y>-2&&y<2) {
            if(x==0&&y==0) return false;
            return true;
        }
        return false;
    }
}

/**
 * Created by Demo on 07.06.2016.
 */
public class strToNum {

    int strToNum(String a){
        char b = a.charAt(0);
        switch (b){
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            default:
                return 0;
        }
    }

    static int numToNum(String a){
        char b = a.charAt(1);
        switch (b){
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            default:
                return 0;
        }
    }

}

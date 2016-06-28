import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/**
 * Created by sunil on 6/28/16.
 */
public class Main {

    public static void main(String[] args){
        List<Remote> phoneList = new ArrayList<Remote>();
        phoneList.add(new GalaxyNote5(false, true));
        phoneList.add(new MotorolaStarTac(true, false));
        phoneList.add(new MotoDroid2(false, true));

        for(Remote r : phoneList){
            r.powerButtonPressed();
            System.out.println();
            r.numberButtonPressed(22);
            System.out.println();
            r.channelDown();
            System.out.println();
            r.channelUp();
            System.out.println();
            r.volumeDown();
            System.out.println();
            r.volumeUp();
        }
    }


}

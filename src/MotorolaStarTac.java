/**
 * Created by sunil on 6/28/16.
 */
public class MotorolaStarTac extends Remote implements WaterProof, Rechargeable, Universal {

    public MotorolaStarTac(boolean nbat, boolean susb) {
        super(nbat, susb);
    }

    @Override
    public void channelUp() {
        System.out.println("channel up from Motorola Star Tac");
    }

    @Override
    public void channelDown() {
        System.out.println("channel down from Motorola Star Tac");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up from Motorola Star Tac");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down from Motorola Star Tac");
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("1st Generation CDMA networks only. 28K Model Laser Printer Fax 900Mhz infa red enhanced experience adapter is $16,500.");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}

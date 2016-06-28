/**
 * Created by sunil on 6/28/16.
 */
public class MotoDroid2 extends Remote implements WaterProof, Universal, Rechargeable {
    public MotoDroid2(boolean nbat, boolean susb) {
        super(nbat, susb);
    }

    @Override
    public void channelUp() {
        System.out.println("Channel up From Moto Droid 2");
    }

    @Override
    public void channelDown() {
        System.out.println("Channel down from Moto Droid 2");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up from Moto Droid 2");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down from Moto Droid 2");
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports all Verizon peripherals at your local Verizon store.");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
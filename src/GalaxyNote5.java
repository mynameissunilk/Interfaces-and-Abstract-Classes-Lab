/**
 * Created by sunil on 6/28/16.
 */
public class GalaxyNote5 extends Remote implements WaterProof, Universal,Rechargeable {
    public GalaxyNote5(boolean nbat, boolean susb) {
        super(nbat, susb);
    }

    @Override
    public void channelUp() {
        System.out.println("Challel up from Galaxy Note 5");
    }

    @Override
    public void channelDown() {
        System.out.println("Channel down from Galaxy Note 5");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up from Galaxy Note 5");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down from Galaxy Note 5");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Compatible with Samsung Gear VR, Samsung SmartDock II, and other 3rd party counterfeit usb peripherals!");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}

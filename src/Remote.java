public abstract class Remote {
    private boolean needsBatteries;
    private boolean supportsUsb;
    private String changeChannel = "Changing channel to: ";

    public Remote(){ //initial conditions for the sake of them...
        needsBatteries = false;
        supportsUsb = true;
    }

    public Remote(boolean nbat, boolean susb){
        needsBatteries = nbat;
        supportsUsb = susb;
    }

    public void setBattery(boolean b){
        this.needsBatteries = b;
    }

    public boolean getBattery(){
        return needsBatteries;
    }

    public void setSupportUSB(boolean b){
        supportsUsb = b;
    }

    public boolean getSupportUSB(){
        return supportsUsb;
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();


    public void powerButtonPressed() {
        System.out.println("The power button was pressed.");
    }


    public void numberButtonPressed(int a) {
         System.out.println(changeChannel + a);
    }
}
import java.util.ArrayList;

public class USB3Adapter extends DVDBurner implements IUSBComputerInterface{
    public void plugInUSB2(){
        plugInUSB3();
        for (IPortListener listener : listeners) {
            listener.pluggedIn();
        }
    }

    private ArrayList<IPortListener> listeners;

    public USB3Adapter(){
        listeners = new ArrayList<>();
    }

    public void addDetector(IPortListener detector){
        listeners.add(detector);
    }

    public void removeDetector(IPortListener detector){
        listeners.remove(detector);

    }
}

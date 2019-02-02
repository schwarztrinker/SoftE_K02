public class USBPort  implements IPortListener {
    public USBPort() {
    }

    @Override
    public void pluggedIn() {
        System.out.println("USB Device plugged in.");
    }
}

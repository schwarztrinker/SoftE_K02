public class Main {
    public static void main(String... args) {
        Computer computer = new Computer();
        IUSBComputerInterface dvdBurner = new USB3Adapter();

        ((USB3Adapter) dvdBurner).addDetector(computer.getUsbPort());
        dvdBurner.plugInUSB2();
    }
}

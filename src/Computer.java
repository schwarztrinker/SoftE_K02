public class Computer{
    public static void main(String[] args) {
        IUSBComputerInterface dvdBurner = new USB3Adapter();

        dvdBurner.plugInUSB2();
    }
}

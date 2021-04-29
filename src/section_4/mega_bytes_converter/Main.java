package section_4.mega_bytes_converter;

public class Main {
    public static void main(String[] args) {
        MegaBytesConverter converter = new MegaBytesConverter();
        converter.printMegaBytesAndKiloBytes(2500);
        converter.printMegaBytesAndKiloBytes(-2500);
        converter.printMegaBytesAndKiloBytes(5000);
    }
}

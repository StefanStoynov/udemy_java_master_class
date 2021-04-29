package section_7.encapsolation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(9, true);
        System.out.println(printer.addToner(1));
        System.out.println("pages "+ printer.getPagesPrinted());
        int pagesPrint = printer.printPages(60);
        System.out.println("pages printed " + pagesPrint + " total count pages "+ printer.getPagesPrinted());
        pagesPrint = printer.printPages(100);
        System.out.println("pages printed " + pagesPrint + " total count pages "+ printer.getPagesPrinted());

    }
}

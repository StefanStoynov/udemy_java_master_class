package section_7.encapsolation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (tonerAmount + this.tonerLevel > 100){
                return -1;
            }
        }else{
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if (duplex) {
            int doublePages = pages / 2;
            int singlePages = pages % 2;
            pagesToPrint = doublePages + singlePages;
        }
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint ;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

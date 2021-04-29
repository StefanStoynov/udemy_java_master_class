Когато имаме inner class деклариран в друг клас, трябва да се внимава да не направим така нареченото "Shadowing".
Shadowing може да се постигне когато имаме в класа, където е деклариран вътрешния клас, поле с идентично име от вътрешния клас. По този начин, 
когато се опитаме да достъпим полето от външния клас от вътрешния клас се получава това "засенчване".

Как се декларира вътрешен клас:

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGear;
    private int gearNumber; \\ shadowing 

    public Gearbox(int maxGear){
        this.maxGear = maxGear;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public class Gear{
        private int gearNumber; \\ shadowing 
        private double ratio;
        
        \\ когато използваме this, то правим референция в класа в който го използваме.

        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        
    }
}

Инициализация на вътрешен клас в Mein класа:


public class Main{

    public static void main (String[]args){
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1, 2.23); 
    }
}

Важно е при инициализацията на вътрешния клас първо да имаме инициализиран външния клас и чак след това може да инициализираме вътрешния. Както е 
показано по-горе.

Хубаво е да се помисли също така дали искаме вътрешния клас да е публичен или да си е само за ползване на външния клас. 
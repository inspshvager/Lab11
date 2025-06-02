package task02;

public enum PizzaSize {
    MALA(30),
    SREDNIA(40),
    DUZA(50);
    private double srednica;

    PizzaSize(double srednica){
        this.srednica = srednica;
    }

    public double getCena(){
        return switch (this){
            case MALA -> 20;
            case SREDNIA -> 30;
            case DUZA -> 40;
        };
    }
}

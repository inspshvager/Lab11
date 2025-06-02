package task01;

public enum Swiatlo{
    CZERWONE,
    ZOLTE,
    ZIELONE;

    public String getKomunikat(){
        return switch (this){
            case CZERWONE -> "Stój!";
            case ZOLTE -> "Uwaga!";
            case ZIELONE -> "Jedź!";
        };
    }
}


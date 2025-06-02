public class Task01 {
    public static void main(String[] args) {
        Swiatlo swiatlo = Swiatlo.CZERWONE;
        System.out.println(swiatlo.getKomunikat());
    }
}

enum Swiatlo{
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


public class App {
    public static void main(String[] args) throws Exception {

        Me myself = new Me();

        Locations boracay = new Boracay();
        Locations dapitan = new Dapitan();
        Locations espana = new Espana();
        Locations jhocson = new Jhocson();
        Locations lerma = new Lerma();
        Locations morayta = new Morayta();

        boracay.accept(myself);
        dapitan.accept(myself);
        espana.accept(myself);
        jhocson.accept(myself);
        lerma.accept(myself);
        morayta.accept(myself);

    }
}
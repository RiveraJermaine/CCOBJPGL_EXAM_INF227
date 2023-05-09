
interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Dapitan dapitan);

    void visit(Espana espana);

    void visit(Jhocson jhocson);

    void visit(Lerma lerma);

    void visit(Morayta morayta);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

}

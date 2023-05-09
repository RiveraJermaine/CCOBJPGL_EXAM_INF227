
public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget >= 100) {
            budget = budget - boracay.airFare;
            if (budget >= 100) {
                System.out.println(" Mainet dito");
            } else {
                System.out.println("Walang money");
            }

            checkBudget();
        }

        else {
            System.out.println("Di napuntahan kapos sa budget");
        }

    }

    public void visit(Espana espana) {
        if (budget >= 100) {
            budget = budget - espana.airFare;
            if (budget >= 100) {
                System.out.println(" Laging traffic here");
            } else {
                System.out.println("Walang money");
            }

            checkBudget();
        }

        else {
            System.out.println("Di napuntahan kapos sa budget");
        }

    }

    public void visit(Dapitan dapitan) {
        if (budget >= 100) {
            budget = budget - dapitan.airFare;
            if (budget >= 100) {
                System.out.println(" Masarap FT");
            } else {
                System.out.println("Walang money");
            }

            checkBudget();
        }

        else {
            System.out.println("Di napuntahan kapos sa budget");
        }

    }

    public void visit(Jhocson jhocson) {
        if (budget >= 100) {
            budget = budget - jhocson.airFare;
            if (budget >= 100) {
                System.out.println(" NU HomeGround to");
            } else {
                System.out.println("Walang money");
            }

            checkBudget();
        }

        else {
            System.out.println("Di napuntahan kapos sa budget");
        }

    }

    public void visit(Lerma lerma) {
        if (budget >= 100) {
            budget = budget - lerma.airFare;
            if (budget >= 100) {
                System.out.println(" Tambayan ng mga pariwara");
            } else {
                System.out.println("Walang money");
            }

            checkBudget();
        }

        else {
            System.out.println("Di napuntahan kapos sa budget");
        }

    }

    public void visit(Morayta morayta) {
        if (budget >= 100) {
            budget = budget - morayta.airFare;
            if (budget >= 100) {
                System.out.println(" Tambayan to ng mga tiga feu");
            } else {
                System.out.println("Di napuntahan kapos sa budget");
            }

            checkBudget();
        }

        else {
            System.out.println("Di napuntahan kapos sa budget");
        }

    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}

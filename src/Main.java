public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor
                        ("Гарри Поттер", 25, 33, 34, 44, 32),
                new Gryffindor
                        ("Гермиона Грейнджер", 20, 30, 32, 32, 33),
                new Gryffindor
                        ("Рон Уизли", 15, 32, 11, 18, 19),

        };

        System.out.println("ФАКУЛЬТЕT ГРИФФИНДОР");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("СТУДЕНТ " + gryffindor.getName() + ", МОЩНОСТЬ МАГИИ- " + gryffindor.getCourage() +
                    ", ЧЕСТЬ- " + gryffindor.getHonor() + ", БЛАГОРОДСТВО- " + gryffindor.getNobility() +
                    ", РАСТОЯНИЕ ТРАНСГРЕССИИ - " + gryffindor.getTransgressionDistance() + ", ХРАБРОСТЬ - " + gryffindor.getCourage());


        }
        System.out.println();
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 12, 15, 14, 15, 19),
                new Hufflepuff("Седрик Диггори", 19, 18, 22, 21, 20),
                new Hufflepuff("Джастин Финч-Флетчли", 13, 17, 12, 19, 18),

        };
        System.out.println("ФАКУЛЬТЕT ПУФИНДУЙ");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("СТУДЕНТ " + hufflepuff.getName() + ", МОЩНОСТЬ МАГИИ- " + hufflepuff.getPowerConjure() +
                    ", РАСТОЯНИЕ ТРАНСГРЕССИИ- " + hufflepuff.getTransgressionDistance() + ", ДРУДОЛЮБИЕ- " + hufflepuff.getHardWork() +
                    ", ВЕРНОСТЬ - " + hufflepuff.getLoyalty() + ", ЧЕСТНОСТЬ- " + hufflepuff.getHonesty());


        }
        System.out.println();

        Cogtevran[] cogtevrans = {
                new Cogtevran("Чжоу Чанг", 17, 22, 16, 14, 19),
                new Cogtevran("Падма Патил", 16, 25, 17, 15, 14),
                new Cogtevran("Чжоу Чанг", 19, 23, 19, 17, 17),

        };
        System.out.println("ФАКУЛЬТЕT КОГТЕВРАН");
        for (int i = 0; i < cogtevrans.length; i++) {
            Cogtevran cogtevran = cogtevrans[i];
            System.out.println("СТУДЕНТ " + cogtevran.getName() + ", МОЩНОСТЬ МАГИИ- " + cogtevran.getPowerConjure() +
                    ", РАСТОЯНИЕ ТРАНСГРЕССИИ- " + cogtevran.getTransgressionDistance() + ", УМ- " + cogtevran.getMind() +
                    ", МУДРОСТЬ - " + cogtevran.getWisdom() + ", ОСТРОУМИЕ- " + cogtevran.getWit());


        }
        System.out.println();

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 22, 29, 20, 15,
                        19, 27, 18),
                new Slytherin("Грэхэм Монтегю", 12, 20, 16, 18,
                        19, 21, 20),
                new Slytherin("Грегори Гойл", 19, 21, 24, 11,
                        17, 15, 18),
        };
        System.out.println("ФАКУЛЬТЕT СЛИЗЕРИН");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("СТУДЕНТ " + slytherin.getName() + ", МОЩНОСТЬ МАГИИ- " + slytherin.getPowerConjure() +
                    ", РАСТОЯНИЕ ТРАНСГРЕССИИ- " + slytherin.getTransgressionDistance() + ", ХИТРОСТЬ- " + slytherin.getCunning() +
                    ", РЕШИМОСТЬ - " + slytherin.getDetermination() + ", АМБИЦИОЗНОСТЬ- " + slytherin.getAmbition() + ", НАХОДЧИВОСТЬ- "
                    + slytherin.getResourcefulness() + ", ЖАЖДА ВЛАСТИ- " + slytherin.getLustForPower());

        }
        System.out.println();
        gryffindors[0].sumBalls(gryffindors[2]);
        System.out.println();
        hufflepuffs[1].sumBalls(hufflepuffs[2]);
        System.out.println();
        cogtevrans[2].sumBalls(cogtevrans[1]);
        System.out.println();
        slytherins[0].sumBalls(slytherins[2]);
        System.out.println();
        slytherins[0].bestMagic(hufflepuffs[1]);
        System.out.println();
        gryffindors[2].bestTransgression(cogtevrans[2]);


    }

}
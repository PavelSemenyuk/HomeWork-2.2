public class Cogtevran extends Hogwarts{
    private int mind;
    private int wisdom;
    private  int wit;
    private int creation;

    public Cogtevran(String name, int powerConjure, int transgressionDistance, int mind, int wisdom, int wit) {
        super(name, powerConjure, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
    }


    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    private int calculate(){
        return this.wit+this.wisdom+this.mind;
    }
    public void sumBalls(Cogtevran cogtevran ) {
        if (this.calculate()>cogtevran.calculate()){
            System.out.println(this.getName() + " лучший КОГТЕВРАНЕЦ, чем " + cogtevran.getName());
        } else {
            System.out.println(cogtevran.getName() + " лучший КОГТЕВРАНЕЦ, чем " + this.getName());
        }
    }

    public void setWit(int wit) {
        this.wit = wit;
    }
}

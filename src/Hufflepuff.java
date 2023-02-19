public class Hufflepuff extends Hogwarts{
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerConjure, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, powerConjure, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int calculate(){
        return this.honesty+this.hardWork+this.loyalty;
    }
    public void sumBalls(Hufflepuff hufflepuff ) {
        if (this.calculate()>hufflepuff.calculate()){
            System.out.println(this.getName() + " лучший ПУФЕНДУЕЦ, чем " + hufflepuff.getName());
        } else {
            System.out.println(hufflepuff.getName() + " лучший ПУФЕНДУЕЦ, чем " + this.getName());
        }
    }
}

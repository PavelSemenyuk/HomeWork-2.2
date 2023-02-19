public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int powerConjure, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerConjure, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    private int calculate(){
        return this.honor+this.courage+this.nobility;
    }

    public void sumBalls(Gryffindor gryffindor ) {
        if (this.calculate()>gryffindor.calculate()){
            System.out.println(this.getName() + " лучший ГРИФФИНДОРЕЦ, чем " + gryffindor.getName());
        } else {
            System.out.println(gryffindor.getName() + " лучший ГРИФФИНДОРЕЦ, чем " + this.getName());
        }
    }
}




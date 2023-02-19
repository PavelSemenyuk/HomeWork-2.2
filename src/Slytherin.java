public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerConjure, int transgressionDistance, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerConjure, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }


    private int calculate(){
        return this.cunning+this.ambition+this.lustForPower+this.determination+this.resourcefulness;
    }
    public void sumBalls(Slytherin slytherin ) {
        if (this.calculate()>slytherin.calculate()){
            System.out.println(this.getName() + " лучший СЛИЗАРЕНЕЦ, чем " + slytherin.getName());
        } else {
            System.out.println(slytherin.getName() + " лучший СЛИЗАРЕНЕЦ, чем " + this.getName());
        }
    }
}
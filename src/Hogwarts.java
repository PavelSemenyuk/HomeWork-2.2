public class Hogwarts {
    private String name;
    private int powerConjure;
    private int transgressionDistance;

    public Hogwarts(String name, int powerConjure, int transgressionDistance) {
        this.name = name;
        this.powerConjure = powerConjure;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConjure() {
        return powerConjure;
    }

    public void setPowerConjure(int powerConjure) {
        this.powerConjure = powerConjure;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int magic() {
       return this.powerConjure ;
    }

    private int transgression(){
        return this.transgressionDistance;
    }

    public void bestMagic(Hogwarts hogwarts) {
        if (this.magic()>hogwarts.magic()){
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем " + hogwarts.getName());
        } else {
            System.out.println(hogwarts.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
        }
    }

    public void bestTransgression(Hogwarts hogwarts) {
        if (this.transgression()>hogwarts.transgression()){
            System.out.println(this.getName() + " обладает бОльшей дальностью трансгрессии, чем " + hogwarts.getName());
        } else {
            System.out.println(hogwarts.getName() + " обладает бОльшей дальностью трансгрессии, чем " + this.getName());
        }
    }

}

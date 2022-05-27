package pl.pjait.leagueofheroes.model.heroes;

public abstract class Hero implements ICanBeHero {

    protected int availableStatPoints;
    protected String name;
    protected int strength, defence, intelligence,
            dexterity, agility, speed;

    protected abstract void modifyStr();

    protected abstract void modifyDef();

    protected abstract void modifyInt();

    protected abstract void modifyDex();

    protected abstract void modifyAgi();

    protected abstract void modifySpd();

    public void raiseStr() {
        if (getAvailableStatPoints() <= 0) return;
        modifyStr();
        availableStatPoints--;
    }

    public void raiseDef() {
        if (getAvailableStatPoints() <= 0) return;
        modifyDef();
        availableStatPoints--;
    }

    public void raiseInt() {
        if (getAvailableStatPoints() <= 0) return;
        modifyInt();
        availableStatPoints--;
    }

    public void raiseDex() {
        if (getAvailableStatPoints() <= 0) return;
        modifyDex();
        availableStatPoints--;
    }

    public void raiseAgi() {
        if (getAvailableStatPoints() <= 0) return;
        modifyAgi();
        availableStatPoints--;
    }

    public void raiseSpd() {
        if (getAvailableStatPoints() <= 0) return;
        modifySpd();
        availableStatPoints--;
    }


    public int getAvailableStatPoints() {
        return availableStatPoints;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void levelUp() {
        availableStatPoints += 10;
    }
}

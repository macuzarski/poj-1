package pl.pjait.leagueofheroes.model.heroes;

public class Knight extends Hero {

    @Override
    public void modifyStr() {
        strength = (int) ((strength + 1) / 1.2);
        strength++;
        strength *= 1.2;
    }

    @Override
    public void modifyDef() {
        defence = (int) ((defence + 1) / 1.1);
        defence++;
        defence *= 1.1;
    }

    @Override
    protected void modifyInt() {
        intelligence++;
    }

    @Override
    public void modifyDex() {
        dexterity = (int) ((dexterity + 1) / 1.05);
        dexterity++;
        dexterity *= 1.05;
    }

    @Override
    public void modifyAgi() {
        agility = (int) ((agility + 1) / 1.02);
        agility++;
        agility *= 1.02;
    }

    @Override
    public void modifySpd() {
        speed = (int) ((speed + 1) / 1.05);
        speed++;
        speed *= 1.05;
    }

}

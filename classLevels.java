public class classLevels {
    private int wizardLevel, clericLevel, rogueLevel, rangerLevel, paladinLevel, monkLevel, druidLevel, fighterLevel, barbarianLevel, bardLevel, sorcererLevel, warlockLevel;
    //Intialize the classLevels all to 0
    public classLevels(){
        this.barbarianLevel = 0;
        this.bardLevel = 0;
        this.clericLevel =0;
        this.druidLevel = 0;
        this.fighterLevel = 0;
        this.monkLevel = 0;
        this.paladinLevel = 0;
        this.rangerLevel = 0;
        this.rogueLevel = 0;
        this.sorcererLevel = 0;
        this.warlockLevel = 0;
        this.wizardLevel = 0;
    }

    public int getWiz(){
        return this.wizardLevel;
    }
    public int getCle(){
        return this.clericLevel;
    }
    public int getRan(){
        return this.rangerLevel;
    }
    public int getRog(){
        return this.rogueLevel;
    }
    public int getPal(){
        return this.paladinLevel;
    }
    public int getBarb(){
        return this.barbarianLevel;
    }
    public int getBard(){
        return this.bardLevel;
    }
    public int getSor(){
        return this.sorcererLevel;
    }
    public int getWar(){
        return this.warlockLevel;
    }
    public int getFig(){
        return this.fighterLevel;
    }
    public int getDru(){
        return this.druidLevel;
    }
    public int getMon(){
        return this.monkLevel;
    }


    public void setWiz(int level){
        this.wizardLevel = level;
    }
    public void setCle(int level){
        this.clericLevel = level;
    }
    public void setRan(int level){
        this.rangerLevel = level;
    }
    public void setRog(int level){
        this.rogueLevel = level;
    }
    public void setPal(int level){
        this.paladinLevel = level;
    }
    public void setBarb(int level){
        this.barbarianLevel = level;
    }
    public void setBard(int level){
        this.bardLevel = level;
    }
    public void setSor(int level){
        this.sorcererLevel = level;
    }
    public void setWar(int level){
        this.warlockLevel = level;
    }
    public void setFig(int level){
        this.fighterLevel = level;
    }
    public void setDru(int level){
        this.druidLevel = level;
    }
    public void setMon(int level){
        this.monkLevel = level;
    }

    public int totalLevel(){
        return this.barbarianLevel+this.bardLevel+this.clericLevel+this.druidLevel+this.fighterLevel+this.monkLevel+this.paladinLevel+this.rangerLevel+this.rogueLevel+this.sorcererLevel+this.warlockLevel+this.wizardLevel;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 * Represents a player's character for us in DnD 5th ed.
 * 
 * @author thom
 */
public class Character {

    // basic info
    private String race, characterName, playerName, background, alignment;
    private ArrayList<int[]> hitDice;

    // Levels in each class
    private classLevels cLevel;

    // proficiency bonus
    private int profBonus;

    // amount of skill proficiences
    private int profAmount;

    // skills that get double prof bonus (knowledge cleric, rogue expertise, etc)
    private boolean[] doubleSkillProfs;

    // armor class
    private int ac;

    // 1st lvl spell slots
    private int firstSlots;

    // size
    private String size;

    // primary ability scores
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;

    // primary ability modifiers
    private int strMod, dexMod, conMod, intMod, wisMod, chaMod;

    // armor received at 1st level
    private String armor;

    // shield received at 1st level
    private String shield;

    // weapons received at 1st level
    private ArrayList<String> weapons;

    // arraylist of stat rolls (before choosing stat assignment)
    private int[] statRolls;

    // saving throws
    private int strengthST, dexterityST, constitutionST, intelligenceST, wisdomST, charismaST;
    private boolean[] sTprofs;

    // skills (values)
    private int[] skills;

    // skill proficiencies (1 if prof., 0 if not)
    private boolean[] skillProfs;

    // passive wisdom (perception)
    private int passiveWis;

    // armor class
    private int armorClass;

    // initiative
    private int initiative;

    // speed (in feet per turn)
    private int speed;

    // HP
    private int maximumHP;
    private int currentHP;
    private int tempHP;

    // weapon attacks
    private ArrayList<WeaponAttack> weaponAttacks;

    // other proficiencies
    private ArrayList<String> proficiencies;

    // languages known
    private ArrayList<String> languages;
    private int languagesAmount;

    // currency ([1] = copper, [2] = silver, etc.) (Unused at the moment)
    private int[] currency;

    // class features
    private ArrayList<String> classFeatures;

    // racial features
    private ArrayList<String> raceFeatures;

    // inventory
    private ArrayList<String> inventory;

    // spell attacks
    private int spellSaveDC;
    private int spellAttackBonus;

    // cantrips
    private ArrayList<String> cantrips;

    // 1st level spells
    private ArrayList<String> firstLevelSpells;

    // Cleric Domain if applicable
    private String clericDomain;

    // Fighting Style if applicable
    private String fightingStyle;

    // Favored Enemy if applicable
    private String favoredEnemy;

    // Sorcerous Origin if applicable
    private String sorcerousOrigin;
    // Draconic Ancestry if Draconic Bloodline chosen
    private String draconicAncestry;

    // Otherworldly Patron if applicable
    private String otherworldlyPatron;

    // used in determining Rogue Expertise at level 1
    private ArrayList<String> rogueProfs;

    private int Experience;

    // create new character object, initialize everything to placeholder values
    public Character() {
        this.race = "";
        this.characterName = "";
        this.playerName = "";
        this.background = "";
        this.alignment = "";
        this.cLevel = new classLevels();
        this.Experience = 0;
        this.tempHP = 0;
        this.hitDice = new ArrayList<int[]>();
        // armor class
        this.ac = 0;

        // proficiency bonus
        this.profBonus = 2;
        // amount of skill proficiencies
        this.profAmount = 0;

        this.doubleSkillProfs = new boolean[18];
        this.sTprofs = new boolean[6];
        for (int i = 0; i < 6; i++)
            this.sTprofs[i] = false;

        // racial size (small, medium)
        this.size = "";

        // 1st level spell slots
        this.firstSlots = 0;

        // primary stats
        this.strength = 0;
        this.dexterity = 0;
        this.intelligence = 0;
        this.constitution = 0;
        this.wisdom = 0;
        this.charisma = 0;

        // stat rolls
        this.statRolls = new int[6];

        // saving throws
        this.strengthST = 0;
        this.dexterityST = 0;
        this.intelligenceST = 0;
        this.constitutionST = 0;
        this.wisdomST = 0;
        this.charismaST = 0;

        // armor and shield
        this.armor = "";
        this.shield = "";

        // skills
        this.skills = new int[18];

        // keeps track of proficiencies (1 for proficient, 0 if not)
        this.skillProfs = new boolean[18];
        for (int i = 0; i < 18; i++)
            this.skillProfs[i] = false;

        // passive wisdom (perception)
        this.passiveWis = 0;

        // armor class
        this.armorClass = 0;

        // initiative
        this.initiative = 0;

        // speed (in feet per turn)
        this.speed = 0;

        // HP
        this.maximumHP = 0;

        // weapon attacks
        this.weaponAttacks = new ArrayList<WeaponAttack>();

        // other proficiencies
        this.proficiencies = new ArrayList<String>();

        // languages known
        this.languages = new ArrayList<String>();
        this.languagesAmount = 0;

        // currency ([1] = copper, [2] = silver, etc.)(unused currently)
        this.currency = new int[5];
        for (int i = 0; i < 5; i++) {
            currency[i] = 0;
        }

        // features and traits
        this.classFeatures = new ArrayList<String>();
        this.raceFeatures = new ArrayList<String>();

        // inventory
        this.inventory = new ArrayList<String>();

        // spell attacks
        this.spellSaveDC = 0;
        this.spellAttackBonus = 0;

        // cantrips
        this.cantrips = new ArrayList<String>();

        // 1st level spells
        this.firstLevelSpells = new ArrayList<String>();

        this.clericDomain = "";
        this.fightingStyle = "";
        this.otherworldlyPatron = "";
        this.favoredEnemy = "";
        this.rogueProfs = new ArrayList<String>();

        this.weapons = new ArrayList<String>();
    }

    /*
     * GETTERS AND SETTERS
     */
    public void setClass(String pClass, int level) {
        if (pClass == "Ranger") {
            this.cLevel.setRan(level);
        } else if (pClass == "Wizard") {
            this.cLevel.setWiz(level);
        } else if (pClass == "Sorceror") {
            this.cLevel.setSor(level);
        } else if (pClass == "Monk") {
            this.cLevel.setMon(level);
        } else if (pClass == "Warlock") {
            this.cLevel.setWar(level);
        } else if (pClass == "Rogue") {
            this.cLevel.setRog(level);
        } else if (pClass == "Fighter") {
            this.cLevel.setFig(level);
        } else if (pClass == "Druid") {
            this.cLevel.setDru(level);
        } else if (pClass == "Cleric") {
            this.cLevel.setCle(level);
        } else if (pClass == "Bard") {
            this.cLevel.setBard(level);
        } else if (pClass == "Barbarian") {
            this.cLevel.setBarb(level);
        } else if (pClass == "Paladin") {
            this.cLevel.setPal(level);
        }
    }

    public int getPlayerClass(String pClass) {
        if (pClass == "Ranger") {
            return this.cLevel.getRan();
        } else if (pClass == "Wizard") {
            return this.cLevel.getWiz();
        } else if (pClass == "Sorceror") {
            return this.cLevel.getSor();
        } else if (pClass == "Monk") {
            return this.cLevel.getMon();
        } else if (pClass == "Warlock") {
            return this.cLevel.getWar();
        } else if (pClass == "Rogue") {
            return this.cLevel.getRog();
        } else if (pClass == "Fighter") {
            return this.cLevel.getFig();
        } else if (pClass == "Druid") {
            return this.cLevel.getDru();
        } else if (pClass == "Cleric") {
            return this.cLevel.getCle();
        } else if (pClass == "Bard") {
            return this.cLevel.getBard();
        } else if (pClass == "Barbarian") {
            return this.cLevel.getBarb();
        } else if (pClass == "Paladin") {
            return this.cLevel.getPal();
        } else {
            return 0;
        }

    }

    public int[] getSavingThrows() {
        int[] sts = new int[6];
        sts[0] = this.strengthST;
        sts[1] = this.dexterityST;
        sts[2] = this.constitutionST;
        sts[3] = this.intelligenceST;
        sts[4] = this.wisdomST;
        sts[5] = this.charismaST;
        return sts;
    }

    public int[] getCurrency() {
        return this.currency;
    }

    public void setCurrency(int index, int value) {
        this.currency[index] = value;
    }

    public ArrayList<int[]> getHitDice() {
        return this.hitDice;
    }

    public void addHitDie(int[] hd) {
        this.hitDice.add(hd);
    }

    public int getTempHP() {
        return this.tempHP;
    }

    public void setTempHP(int thp) {
        this.tempHP = thp;
    }

    public int getXP() {
        return this.Experience;
    }

    public void setRace(String pRace) {
        this.race = pRace;
    }

    public String getRace() {
        return this.race;
    }

    public void setStatRolls(int index, int value) {
        this.statRolls[index] = value;
    }

    public int[] getStatRolls() {
        return this.statRolls;
    }

    public int getThisStatRoll(int index) {
        return this.statRolls[index];
    }

    public void setStrength(int value) {
        this.strength = value;
    }

    public void setDexterity(int value) {
        this.dexterity = value;
    }

    public void setConstitution(int value) {
        this.constitution = value;
    }

    public void setIntelligence(int value) {
        this.intelligence = value;
    }

    public void setWisdom(int value) {
        this.wisdom = value;
    }

    public void setCharisma(int value) {
        this.charisma = value;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getConstitution() {
        return this.constitution;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public int getCharisma() {
        return this.charisma;
    }

    public void setBackground(String bg) {
        this.background = bg;
    }

    public String getBackground() {
        return this.background;
    }

    public void setAlignment(String align) {
        this.alignment = align;
    }

    public String getAlignment() {
        return this.alignment;
    }

    public int getProfAmount() {
        return this.profAmount;
    }

    public void setProfAmount(int amount) {
        this.profAmount = amount;
    }

    public boolean getThisSkillProf(int index) {
        return this.skillProfs[index];
    }

    public void setThisSkillProf(int index, Boolean amount) {
        this.skillProfs[index] = amount;
    }

    public int getThisSkill(int index) {
        return this.skills[index];
    }

    public boolean[] getSavingThrowProfs() {
        return this.sTprofs;
    }

    public void setThisSkill(int index, int amount) {
        this.skills[index] = amount;
    }

    public void setStrMod(int value) {
        this.strMod = value;
    }

    public void setDexMod(int value) {
        this.dexMod = value;
    }

    public void setConMod(int value) {
        this.conMod = value;
    }

    public void setIntMod(int value) {
        this.intMod = value;
    }

    public void setWisMod(int value) {
        this.wisMod = value;
    }

    public void setChaMod(int value) {
        this.chaMod = value;
    }

    public int getStrMod() {
        return this.strMod;
    }

    public int getDexMod() {
        return this.dexMod;
    }

    public int getConMod() {
        return this.conMod;
    }

    public int getIntMod() {
        return this.intMod;
    }

    public int getWisMod() {
        return this.wisMod;
    }

    public int getChaMod() {
        return this.chaMod;
    }

    public int getProfBonus() {
        return this.profBonus;
    }

    public String getClericDomain() {
        return this.clericDomain;
    }

    public void setClericDomain(String domain) {
        this.clericDomain = domain;
    }

    public void setThisDoubleProf(int index) {
        this.doubleSkillProfs[index] = true;
    }

    public boolean[] getDoubleProfs() {
        return this.doubleSkillProfs;
    }

    public String getFightingStyle() {
        return this.fightingStyle;
    }

    public void setFightingStyle(String fs) {
        this.fightingStyle = fs;
    }

    public String getSorcerousOrigin() {
        return this.sorcerousOrigin;
    }

    public void setSorcerousOrigin(String so) {
        this.sorcerousOrigin = so;
    }

    public String getDraconicAncestry() {
        return this.draconicAncestry;
    }

    public void setDraconicAncestry(String da) {
        this.draconicAncestry = da;
    }

    public String getFavoredEnemy() {
        return this.favoredEnemy;
    }

    public void setFavoredEnemy(String fe) {
        this.favoredEnemy = fe;
    }

    public String getOtherworldlyPatron() {
        return this.otherworldlyPatron;
    }

    public void setOtherworldlyPatron(String op) {
        this.otherworldlyPatron = op;
    }

    public ArrayList<String> getRogueProfs() {
        return this.rogueProfs;
    }

    public void addThisRogueProf(String prof) {
        this.rogueProfs.add(prof);
    }

    public ArrayList<String> getOtherProficiencies() {
        return this.proficiencies;
    }

    public void addThisOtherProf(String prof) {
        this.proficiencies.add(prof);
    }

    public ArrayList<String> getLanguages() {
        return this.languages;
    }

    public void addThisLanguage(String lang) {
        this.languages.add(lang);
    }

    public int getLanguageAmount() {
        return this.languagesAmount;
    }

    public void setLanguageAmount(int amt) {
        this.languagesAmount = amt;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public void setPlayerName(String name) {
        this.playerName = name;
    }

    public void setCharacterName(String name) {
        this.characterName = name;
    }

    public ArrayList<String> getCantrips() {
        return this.cantrips;
    }

    public void addThisCantrip(String cantrip) {
        this.cantrips.add(cantrip);
    }

    public ArrayList<String> getFirstLevelSpells() {
        return this.firstLevelSpells;
    }

    public void addThisFirstLevel(String spell) {
        this.firstLevelSpells.add(spell);
    }

    public int getSpellSave() {
        return spellSaveDC;
    }

    public int getSpellAttack() {
        return spellAttackBonus;
    }

    public ArrayList<String> getInventory() {
        return this.inventory;
    }

    public void addThisToInventory(String items) {
        this.inventory.add(items);
    }

    public void addThisWeapon(String wpn) {
        this.weapons.add(wpn);
    }

    public ArrayList<String> getWeapons() {
        return this.weapons;
    }

    public int getFirstSlots() {
        return firstSlots;
    }

    public ArrayList<String> getSpells() {
        return firstLevelSpells;
    }

    public void setArmor(String a) {
        this.armor = a;
    }

    public String getArmor() {
        return this.armor;
    }

    public void setShield(String sh) {
        this.shield = sh;
    }

    public int getPassivePerception() {
        return passiveWis;
    }

    public int getMaxHP() {
        return maximumHP;
    }

    public int getArmorClass() {
        return ac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getSize() {
        return size;
    }

    public int getInit() {
        return initiative;
    }

    public boolean hasShield() {
        return (!shield.equals(""));
    }

    public ArrayList<WeaponAttack> getAttacks() {
        return weaponAttacks;
    }

    public ArrayList<String> getClassFeatures() {
        return classFeatures;
    }

    public ArrayList<String> getRaceFeatures() {
        return raceFeatures;
    }

    public ArrayList<String> getProficiencies() {
        return proficiencies;
    }

    public int getCurrentHP() {
        return this.currentHP;
    }

    public void setCurrentHP(int hp) {
        this.currentHP = hp;
    }

    // computes the remaining data not received via input from user
    public void computeRest() {
        // compute saving throw stats and hp
        this.strengthST = strMod;
        this.dexterityST = dexMod;
        this.constitutionST = conMod;
        this.intelligenceST = intMod;
        this.charismaST = chaMod;
        this.wisdomST = wisMod;

        // add features and stats given by class choice
        if (this.cLevel.totalLevel() == 1) {
            if (this.cLevel.getBarb() == 1) {
                barbarianChanges();
            }
            if (this.cLevel.getBard() == 1) {
                bardChanges();
            }
            if (this.cLevel.getCle() == 1) {
                clericChanges();
            }
            if (this.cLevel.getDru() == 1) {
                druidChanges();
            }
            if (this.cLevel.getFig() == 1) {
                fighterChanges();
            }
            if (this.cLevel.getMon() == 1) {
                monkChanges();
            }
            if (this.cLevel.getPal() == 1) {
                paladinChanges();
            }
            if (this.cLevel.getRan() == 1) {
                rangerChanges();
            }
            if (this.cLevel.getRog() == 1) {
                rogueChanges();
            }
            if (this.cLevel.getSor() == 1) {
                sorcererChanges();
            }
            if (this.cLevel.getWar() == 1) {
                warlockChanges();
            }
            if (this.cLevel.getWiz() == 1) {
                wizardChanges();
            }
        }

        // compute Armor Class
        computeArmorClass();

        // passive wisdom
        passiveWis = 10 + skills[11];

        // compute initiative
        initiative = dexMod;

        // add racial features/traits/speed/size
        if (race.equals("Mountain Dwarf") || race.equals("Hill Dwarf")) {
            dwarfChanges();
        } else if (race.equals("High Elf") || race.equals("Wood Elf") || race.equals("Dark Elf (Drow)")) {
            elfChanges();
        } else if (race.equals("Lightfoot Halfling") || race.equals("Stout Halfling")) {
            halflingChanges();
        } else if (race.equals("Human") || race.equals("Human (Variant)")) {
            humanChanges();
        } else if (race.equals("Forest Gnome") || race.equals("Rock Gnome")) {
            gnomeChanges();
        } else if (race.equals("Half-Elf")) {
            halfElfChanges();
        } else if (race.equals("Half-Orc")) {
            halfOrcChanges();
        } else if (race.equals("Tiefling")) {
            tieflingChanges();
        } else {
            dragonbornChanges();
        }

        // create weapon attack list out of weapon list
        createWeaponAttacks();
        setCurrentHP(this.maximumHP);
    }

    // CLASS FEATURES HELPER METHODS
    // used in compute(), carry out Barbarian class changes
    private void barbarianChanges() {
        strengthST = strMod + profBonus;
        sTprofs[0] = true;
        constitutionST = conMod + profBonus;
        sTprofs[2] = true;
        maximumHP = 12 + conMod;
        int[] hd = { 1, 12 };
        this.hitDice.add(hd);
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        proficiencies.add("Strength Saving Throw");
        proficiencies.add("Constitution Saving Throw");
        classFeatures.add("Rage x2");
        classFeatures.add("Unarmored Defense");
    }

    // used in compute(), carry out Bard class changes
    private void bardChanges() {
        dexterityST = dexMod + profBonus;
        sTprofs[1] = true;
        charismaST = chaMod + profBonus;
        sTprofs[5] = true;
        maximumHP = 8 + conMod;
        int[] hd = { 1, 8 };
        this.hitDice.add(hd);
        proficiencies.add("Light Armor");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Hand Crossbows");
        proficiencies.add("Longswords");
        proficiencies.add("Rapiers");
        proficiencies.add("Shortswords");
        proficiencies.add("3 Musical Instruments of your choice");
        proficiencies.add("Dexterity Saving Throw");
        proficiencies.add("Charisma Saving Throw");
        spellSaveDC = 8 + profBonus + chaMod;
        spellAttackBonus = profBonus + chaMod;
        firstSlots = 2;
        classFeatures.add("Bardic Inspiration (xCharisma Mod)");
        classFeatures.add("Spellcasting");
    }

    // used in compute(), carry out Cleric class changes
    private void clericChanges() {
        wisdomST = wisMod + profBonus;
        sTprofs[4] = true;
        charismaST = chaMod + profBonus;
        sTprofs[5] = true;
        maximumHP = 8 + conMod;
        int[] hd = { 1, 8 };
        this.hitDice.add(hd);
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("All Simple Weapons");
        proficiencies.add("Wisdom Saving Throw");
        proficiencies.add("Charisma Saving Throw");
        spellSaveDC = 8 + profBonus + wisMod;
        spellAttackBonus = profBonus + wisMod;
        firstSlots = 2;
        classFeatures.add("Spellcasting");
        if (clericDomain.equals("Knowledge")) {
            classFeatures.add("1st-level Spells always prepared: Command, Identify");
        } else if (clericDomain.equals("Life")) {
            classFeatures.add("Disciple of Life");
            proficiencies.add("Heavy Armor");
            classFeatures.add("1st-level Spells always prepared: Bless, Cure Wounds");
        } else if (clericDomain.equals("Light")) {
            ArrayList<String> c = cantrips;
            boolean alreadyChosen = false;
            for (String cantrip : c) {
                if (cantrip.equals("Light"))
                    alreadyChosen = true;
            }
            if (!alreadyChosen)
                cantrips.add("Light");
            classFeatures.add("Warding Flare");
            classFeatures.add("1st-level Spells always prepared: Burning Hands, Faerie Fire");
        } else if (clericDomain.equals("Nature")) {
            classFeatures.add("1st-level Spells always prepared: Animal Friendship, Speak with Animals");
            classFeatures.add("1 druid cantrip of your choice");
            proficiencies.add("Heavy Armor");
        } else if (clericDomain.equals("Tempest")) {
            classFeatures.add("1st-level Spells always prepared: Fog Cloud, Thunderwave");
            proficiencies.add("Martial Weapons");
            proficiencies.add("Heavy Armor");
            classFeatures.add("Wrath of the Storm");
        } else if (clericDomain.equals("Trickery")) {
            classFeatures.add("1st-level Spells always prepared: Charm Person, Disguise Self");
            classFeatures.add("Blessing of the Trickster");
        } else {
            classFeatures.add("1st-level Spells always prepared: Divine Favor, Shield of Faith");
            proficiencies.add("Heavy Armor");
            proficiencies.add("Martial Weapons");
            classFeatures.add("War Priest");
        }
    }

    // used in compute(), carry out Druid changes
    private void druidChanges() {
        intelligenceST = intMod + profBonus;
        sTprofs[3] = true;
        wisdomST = wisMod + profBonus;
        sTprofs[4] = true;
        maximumHP = 8 + conMod;
        int[] hd = { 1, 8 };
        this.hitDice.add(hd);
        firstSlots = 2;
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Clubs");
        proficiencies.add("Daggers");
        proficiencies.add("Darts");
        proficiencies.add("Javelins");
        proficiencies.add("Maces");
        proficiencies.add("Quarterstaffs");
        proficiencies.add("Scimitars");
        proficiencies.add("Sickles");
        proficiencies.add("Slings");
        proficiencies.add("Spears");
        proficiencies.add("Herbalism Kit");
        proficiencies.add("Intelligence Saving Throw");
        proficiencies.add("Wisdom Saving Throw");
        spellSaveDC = 8 + profBonus + wisMod;
        spellAttackBonus = profBonus + wisMod;
        classFeatures.add("Druidic (language)");
        classFeatures.add("Spellcasting");
    }

    // used in compute(), carry out Fighter class changes
    private void fighterChanges() {
        strengthST = strMod + profBonus;
        sTprofs[0] = true;
        constitutionST = conMod + profBonus;
        sTprofs[2] = true;
        maximumHP = 10 + conMod;
        int[] hd = { 1, 10 };
        this.hitDice.add(hd);
        proficiencies.add("All Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        proficiencies.add("Strength Saving Throws");
        proficiencies.add("Constitution Saving Throws");
        classFeatures.add("Second Wind");
    }

    // used in compute(), carry out Monk class changes
    private void monkChanges() {
        dexterityST = dexMod + profBonus;
        sTprofs[1] = true;
        strengthST = strMod + profBonus;
        sTprofs[0] = true;
        maximumHP = 8 + conMod;
        int[] hd = { 1, 8 };
        this.hitDice.add(hd);
        proficiencies.add("Simple Weapons");
        proficiencies.add("Shortswords");
        proficiencies.add("Choose 1 type of Artisan's Tools or One Musical Instrument");
        proficiencies.add("Strength Saving Throws");
        proficiencies.add("Dexterity Saving Throws");
        classFeatures.add("Unarmored Defense");
        classFeatures.add("Martial Arts (1d4)");
    }

    // used in compute(), carry out Paladin class changes
    private void paladinChanges() {
        wisdomST = wisMod + profBonus;
        sTprofs[4] = true;
        charismaST = chaMod + profBonus;
        sTprofs[5] = true;
        maximumHP = 10 + conMod;
        int[] hd = { 1, 10 };
        this.hitDice.add(hd);
        proficiencies.add("All armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        proficiencies.add("Wisdom Saving Throws");
        proficiencies.add("Charisma Saving Throws");
        classFeatures.add("Lay on Hands");
        classFeatures.add("Divine Sense");
    }

    // used compute(), carry out Ranger class changes
    private void rangerChanges() {
        strengthST = strMod + profBonus;
        sTprofs[0] = true;
        dexterityST = dexMod + profBonus;
        sTprofs[1] = true;
        maximumHP = 10 + conMod;
        int[] hd = { 1, 10 };
        this.hitDice.add(hd);
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        proficiencies.add("Strength Saving Throw");
        proficiencies.add("Dexterity Saving Throw");
        classFeatures.add("Natural Explorer");
    }

    // used compute(), carry out Rogue class changes
    private void rogueChanges() {
        dexterityST = dexMod + profBonus;
        sTprofs[1] = true;
        intelligenceST = intMod + profBonus;
        sTprofs[3] = true;
        maximumHP = 8 + conMod;
        int[] hd = { 1, 8 };
        this.hitDice.add(hd);
        proficiencies.add("Light Armor");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Hand Crossbows");
        proficiencies.add("Longswords");
        proficiencies.add("Rapiers");
        proficiencies.add("Shortswords");
        proficiencies.add("Dexterity Saving Throws");
        proficiencies.add("Intelligence Saving Throws");
        classFeatures.add("Sneak Attack (1d6)");
        classFeatures.add("Expertise");
    }

    // used in compute(), carry out Sorcerer class changes
    private void sorcererChanges() {
        constitutionST = conMod + profBonus;
        sTprofs[2] = true;
        charismaST = chaMod + profBonus;
        sTprofs[5] = true;
        maximumHP = 6 + conMod;
        int[] hd = { 1, 6 };
        this.hitDice.add(hd);
        firstSlots = 2;
        proficiencies.add("Daggers");
        proficiencies.add("Darts");
        proficiencies.add("Slings");
        proficiencies.add("Quarterstaffs");
        proficiencies.add("Light Crossbows");
        proficiencies.add("Constitution Saving Throws");
        proficiencies.add("Charisma Saving Throws");
        spellSaveDC = 8 + profBonus + chaMod;
        spellAttackBonus = profBonus + chaMod;
        classFeatures.add("Spellcasting");
        if (sorcerousOrigin.equals("Draconic Bloodline")) {
            classFeatures.add("Draconic Resilience");
            classFeatures.add("Dragon Ancestor");
            maximumHP = maximumHP + 1;
        } else {
            classFeatures.add("Wild Magic Surge");
            classFeatures.add("Tides of Chaos");
        }
    }

    // used in compute(), carry out Warlock class changes
    private void warlockChanges() {
        wisdomST = wisMod + profBonus;
        sTprofs[4] = true;
        charismaST = chaMod + profBonus;
        sTprofs[5] = true;
        maximumHP = 8 + conMod;
        int[] hd = { 1, 8 };
        this.hitDice.add(hd);
        firstSlots = 1;
        proficiencies.add("Light Armor");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Wisdom Saving Throws");
        proficiencies.add("Charisma Saving Throws");
        spellSaveDC = 8 + profBonus + chaMod;
        spellAttackBonus = profBonus + chaMod;
        if (otherworldlyPatron.equals("Archfey"))
            classFeatures.add("Fey Presence");
        else if (otherworldlyPatron.equals("The Fiend"))
            classFeatures.add("Dark One's Blessing");
        else
            classFeatures.add("Awakened Mind");
    }

    // used in compute(), carry out Wizard class changes
    private void wizardChanges() {
        intelligenceST = intMod + profBonus;
        sTprofs[3] = true;
        wisdomST = wisMod + profBonus;
        sTprofs[4] = true;
        maximumHP = 6 + conMod;
        int[] hd = { 1, 6 };
        this.hitDice.add(hd);
        proficiencies.add("Daggers");
        proficiencies.add("Darts");
        proficiencies.add("Slings");
        proficiencies.add("Quarterstaffs");
        proficiencies.add("Light Crossbows");
        proficiencies.add("Intelligence Saving Throws");
        proficiencies.add("Wisdom Saving Throws");
        firstSlots = 2;
        classFeatures.add("Spellcasting");
        classFeatures.add("Arcane Recovery");
        spellSaveDC = 8 + profBonus + intMod;
        spellAttackBonus = profBonus + intMod;
    }

    // computes armor class, based on class choice and armor choice
    private void computeArmorClass() {
        if (this.cLevel.getMon() >= 1)
            ac = 10 + dexMod + wisMod;
        else if (this.cLevel.getBarb() >= 1)
            ac = 10 + dexMod + conMod;
        else if (this.cLevel.getSor() >= 1 && sorcerousOrigin.equals("Draconic Bloodline"))
            ac = 13 + dexMod;
        else {
            if (armor.equals("Leather Armor"))
                ac = 11 + dexMod;
            else if (armor.equals("Scale Mail")) {
                if (dexMod >= 2)
                    ac = 16;
                else
                    ac = 14 + dexMod;
            } else if (armor.equals("Chain Mail"))
                ac = 16;
            else
                ac = 10 + dexMod;
        }
        if (fightingStyle.equals("Defense"))
            ac = ac + 1;
        if (!shield.equals(""))
            ac = ac + 2;
    }

    // RACIAL FEATURES HELPER METHODS
    // used in compute, carry out Dwarf changes
    private void dwarfChanges() {
        size = "Medium";
        speed = 25;
        raceFeatures.add("Darkvision");
        raceFeatures.add("Dwarven Resilience");
        raceFeatures.add("Dwarven Combat Training (prof w/ battleaxe,handaxe,throwing hammer,warhammer)");
        raceFeatures.add("Stonecutting");
        if (race.equals("Hill Dwarf")) {
            maximumHP = maximumHP + 1;
            raceFeatures.add("Dwarven Toughness");
        } else {
            raceFeatures.add("Dwarven Armor Training (prof w/ light and medium armor)");
        }
    }

    // used in compute(), carry out Elf changes
    private void elfChanges() {
        size = "Medium";
        speed = 30;
        raceFeatures.add("Darkvision");
        raceFeatures.add("Fey Ancestry");
        raceFeatures.add("Trance");
        raceFeatures.add("Keen Senses");
        if (race.equals("High Elf")) {
            raceFeatures.add("Elf Weapon Training (prof w/ longsword,shortsword,shortbow,longbow)");
            raceFeatures.add("1 Wizard Cantrip");
            raceFeatures.add("Extra Language");
        } else if (race.equals("Wood Elf")) {
            raceFeatures.add("Elf Weapon Training (prof w/ longsword,shortsword,shortbow,longbow)");
            raceFeatures.add("Fleet of Foot");
            speed = 35;
            raceFeatures.add("Mask of the Wild");
        } else {
            raceFeatures.add("Superior Darkvision");
            raceFeatures.add("Sunlight Sensitivity");
            raceFeatures.add("Drow Magic");
            raceFeatures.add("Drow Weapon Training (prof w/ rapiers,shortswords,hand crossbows)");
        }
    }

    // used in compute, carry out Halfling changes
    private void halflingChanges() {
        size = "small";
        speed = 25;
        raceFeatures.add("Brave");
        raceFeatures.add("Lucky");
        raceFeatures.add("Halfling Nimbleness");
        if (race.equals("Lightfoot Halfling"))
            raceFeatures.add("Naturally Stealthy");
        else
            raceFeatures.add("Stout Resilience");
    }

    // used in compute, carry out Human changes
    private void humanChanges() {
        size = "Medium";
        speed = 30;
        if (race.equals("Human (Variant)"))
            raceFeatures.add("Choose 1 Feat");
    }

    // used in compute(), carry out Gnome changes
    private void gnomeChanges() {
        size = "Small";
        speed = 25;
        raceFeatures.add("Darkvision");
        raceFeatures.add("Gnome Cunning");
        if (race.equals("Forest Gnome")) {
            raceFeatures.add("Natural Illusionist");
            raceFeatures.add("Speak with Small Beasts");
        } else {
            raceFeatures.add("Artificer's Lore");
            raceFeatures.add("Tinker");
        }
    }

    // used in compute(), carry out Half-Elf changes
    private void halfElfChanges() {
        size = "Medium";
        speed = 30;
        raceFeatures.add("Darkvision");
        raceFeatures.add("Fey Ancestry");
    }

    // used in compute(), carry out Half-Orc changes
    private void halfOrcChanges() {
        size = "Medium";
        speed = 35;
        raceFeatures.add("Darkvision");
        raceFeatures.add("Relentless Endurance");
        raceFeatures.add("Savage Attacks");
        raceFeatures.add("Menacing");
    }

    // used in compute(), carry out Tiefling changes
    private void tieflingChanges() {
        size = "Medium";
        speed = 30;
        raceFeatures.add("Darkvision");
        raceFeatures.add("Hellish Resistance");
        raceFeatures.add("Infernal Legacy");
    }

    // used in compute(), carry out Dragonborn changes
    private void dragonbornChanges() {
        size = "Medium";
        speed = 30;
        raceFeatures.add("Draconic Ancestry");
        raceFeatures.add("Breath Weapon");
        raceFeatures.add("Damage Resistance");
    }

    // used in compute(), creates weapon attack list
    private void createWeaponAttacks() {
        if (!weapons.isEmpty()) {
            for (String weap : weapons) {
                if (WeaponAttack.isRanged(weap))
                    weaponAttacks.add(new WeaponAttack(weap, dexMod, profBonus));
                else if (WeaponAttack.isFinesse(weap)) {
                    if (dexMod >= strMod)
                        weaponAttacks.add(new WeaponAttack(weap, dexMod, profBonus));
                    else
                        weaponAttacks.add(new WeaponAttack(weap, strMod, profBonus));
                } else {
                    weaponAttacks.add(new WeaponAttack(weap, strMod, profBonus));
                }
            }
        }
    }
}

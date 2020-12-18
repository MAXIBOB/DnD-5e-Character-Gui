/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author thom
 * writes a characters info onto a .txt file, which is then saved onto the desktop
 */
public class CharacterWriter
{
    PrintWriter writer;
    File characterFile;
    Character character;
    String filePath;
    
    public CharacterWriter(String path, Character cha)
    {
        this.characterFile = new File(path);
        this.character = cha;
        this.filePath = path;
        this.writer = null;
    }
    
    public void createCharacterFile()
    {
        int[] savingThrows = character.getSavingThrows();
        try{
            writer = new PrintWriter(filePath,"UTF-8");
            writer.println("Player Name : " + this.character.getPlayerName());
            writer.println("Character Name : " + this.character.getCharacterName());
            writer.println("");
            String temp = "";

            if(this.character.getPlayerClass("Barbarian") > 0)
            {
                temp = "Barbarian " + this.character.getPlayerClass("Barbarian");
            }
            if(this.character.getPlayerClass("Bard") > 0)
            {
                if(temp.equals("")){
                    temp = "Bard " + this.character.getPlayerClass("Bard");
                } else{
                    temp = temp + " / Bard" + this.character.getPlayerClass("Bard");
                }
            }
            if(this.character.getPlayerClass("Cleric") > 0)
            {
                if(temp.equals("")){
                    temp = "Cleric " + this.character.getPlayerClass("Cleric");
                } else{
                    temp = temp + " / Cleric" + this.character.getPlayerClass("Cleric");
                }
            }
            if(this.character.getPlayerClass("Druid") > 0)
            {
                if(temp.equals("")){
                    temp = "Druid " + this.character.getPlayerClass("Druid");
                } else{
                    temp = temp + " / Druid" + this.character.getPlayerClass("Druid");
                }
            }
            if(this.character.getPlayerClass("Fighter") > 0)
            {
                if(temp.equals("")){
                    temp = "Fighter " + this.character.getPlayerClass("Fighter");
                } else{
                    temp = temp + " / Fighter" + this.character.getPlayerClass("Fighter");
                }
            }
            if(this.character.getPlayerClass("Monk") > 0)
            {
                if(temp.equals("")){
                    temp = "Monk " + this.character.getPlayerClass("Monk");
                } else{
                    temp = temp + " / Monk" + this.character.getPlayerClass("Monk");
                }
            }
            if(this.character.getPlayerClass("Ranger") > 0)
            {
                if(temp.equals("")){
                    temp = "Ranger " + this.character.getPlayerClass("Ranger");
                } else{
                    temp = temp + " / Ranger" + this.character.getPlayerClass("Ranger");
                }
            }
            if(this.character.getPlayerClass("Rogue") > 0)
            {
                if(temp.equals("")){
                    temp = "Rogue " + this.character.getPlayerClass("Rogue");
                } else{
                    temp = temp + " / Rogue" + this.character.getPlayerClass("Rogue");
                }
            }
            if(this.character.getPlayerClass("Paladin") > 0)
            {
                if(temp.equals("")){
                    temp = "Paladin " + this.character.getPlayerClass("Paladin");
                } else{
                    temp = temp + " / Paladin" + this.character.getPlayerClass("Paladin");
                }
            }
            if(this.character.getPlayerClass("Sorceror") > 0)
            {
                if(temp.equals("")){
                    temp = "Sorceror " + this.character.getPlayerClass("Sorceror");
                } else{
                    temp = temp + " / Sorceror" + this.character.getPlayerClass("Sorceror");
                }
            }
            if(this.character.getPlayerClass("Warlock") > 0)
            {
                if(temp.equals("")){
                    temp = "Warlock " + this.character.getPlayerClass("Warlock");
                } else{
                    temp = temp + " / Warlock" + this.character.getPlayerClass("Warlock");
                }
            }
            if(this.character.getPlayerClass("Wizard") > 0)
            {
                if(temp.equals("")){
                    temp = "Wizard " + this.character.getPlayerClass("Wizard");
                } else{
                    temp = temp + " / Wizard" + this.character.getPlayerClass("Wizard");
                }
            }


            writer.println("Level 1 " + this.character.getRace() + " " + temp);
            writer.println("Background : " + this.character.getBackground());
            writer.println("Alignment  : " + this.character.getAlignment());
            writer.println("");
            
            if(this.character.getStrMod() < 0)
                writer.println("Strength     : " + this.character.getStrength() + "     " + this.character.getStrMod());
            else
                writer.println("Strength     : " + this.character.getStrength() + "    +" + this.character.getStrMod());
            if(this.character.getDexMod() < 0)
                writer.println("Dexterity    : " + this.character.getDexterity() + "     " + this.character.getDexMod());
            else
                writer.println("Dexterity    : " + this.character.getDexterity() + "    +" + this.character.getDexMod());
            if(this.character.getConMod() < 0)
                writer.println("Constitution : " + this.character.getConstitution() + "     " + this.character.getConMod());
            else
                writer.println("Constitution : " + this.character.getConstitution() + "    +" + this.character.getConMod());
            if(this.character.getIntMod() < 0)
                writer.println("Intelligence : " + this.character.getIntelligence() + "     " + this.character.getIntMod());
            else
                writer.println("Intelligence : " + this.character.getIntelligence() + "    +" + this.character.getIntMod());
            if(this.character.getWisMod() < 0)
                writer.println("Wisdom       : " + this.character.getWisdom() + "     " + this.character.getWisMod());
            else
                writer.println("Wisdom       : " + this.character.getWisdom() + "    +" + this.character.getWisMod());
            if(this.character.getChaMod() < 0)
                writer.println("Charisma     : " + this.character.getCharisma() + "     " + this.character.getChaMod());
            else
                writer.println("Charisma     : " + this.character.getCharisma() + "    +" + this.character.getChaMod());
                writer.println("");
            
            writer.println("________Saving Throws________");
            writer.println("Strength     : " + savingThrows[0]);
            writer.println("Dexterity    : " + savingThrows[1]);
            writer.println("Constitution : " + savingThrows[2]);
            writer.println("Intelligence : " + savingThrows[3]);
            writer.println("Wisdom       : " + savingThrows[4]);
            writer.println("Charisma     : " + savingThrows[5]);
            writer.println("");
            
            writer.println("Max HP : " + character.getMaxHP());
            if(character.hasShield())
            {
                writer.println("Armor Class (AC) : " + (character.getArmorClass()-2));
                writer.println("Armor Class (AC) : " + character.getArmorClass() + " (with shield equipped)");
            }
            else    
                writer.println("Armor Class (AC) : " + character.getArmorClass());
            writer.println("Initiative : " + character.getInit());
            writer.println("Speed : " + character.getSpeed());
            writer.println("Size : " + character.getSize());
            writer.println("");
            
            writer.println("Proficiency Bonus : " + character.getProfBonus());
            writer.println("");
            
            writer.println("________Skills________");
            if(character.getThisSkillProf(0))
                writer.println("Acrobatics      : " + character.getThisSkill(0));
            else
                writer.println("Acrobatics      : " + character.getThisSkill(0) + " * ");
            
            if(character.getThisSkillProf(1))
                writer.println("Animal Handling : " + character.getThisSkill(1));
            else
                writer.println("Animal Handling : " + character.getThisSkill(1) + " * ");
            
            if(character.getThisSkillProf(2))
                writer.println("Arcana          : " + character.getThisSkill(2));
            else
                writer.println("Arcana          : " + character.getThisSkill(2) + " * ");
            
            if(character.getThisSkillProf(3))
                writer.println("Athletics       : " + character.getThisSkill(3));
            else
                writer.println("Athletics       : " + character.getThisSkill(3) + " * ");
            
            if(character.getThisSkillProf(4))
                writer.println("Deception       : " + character.getThisSkill(4));
            else
                writer.println("Deception       : " + character.getThisSkill(4) + " * ");
            
            if(character.getThisSkillProf(5))
                writer.println("History         : " + character.getThisSkill(5));
            else
                writer.println("History         : " + character.getThisSkill(5) + " * ");
            
            if(character.getThisSkillProf(6))
                writer.println("Insight         : " + character.getThisSkill(6));
            else
                writer.println("Insight         : " + character.getThisSkill(6) + " * ");
            
            if(character.getThisSkillProf(7))
                writer.println("Intimidation    : " + character.getThisSkill(7));
            else
                writer.println("Intimidation    : " + character.getThisSkill(7) + " * ");
            
            if(character.getThisSkillProf(8))
                writer.println("Investigation   : " + character.getThisSkill(8));
            else
                writer.println("Investigation   : " + character.getThisSkill(8) + " * ");
            
            if(character.getThisSkillProf(9))
                writer.println("Medicine        : " + character.getThisSkill(9));
            else
                writer.println("Medicine        : " + character.getThisSkill(9) + " * ");
                
            if(character.getThisSkillProf(10))
                writer.println("Nature          : " + character.getThisSkill(10));
            else
                writer.println("Nature          : " + character.getThisSkill(10) + " * ");
            
            if(character.getThisSkillProf(11))
                writer.println("Perception      : " + character.getThisSkill(11));
            else
                writer.println("Perception      : " + character.getThisSkill(11) + " * ");
            
            if(character.getThisSkillProf(12))
                writer.println("Performance     : " + character.getThisSkill(12));
            else
                writer.println("Performance     : " + character.getThisSkill(12) + " * ");
            
            if(character.getThisSkillProf(13))
                writer.println("Persuasion      : " + character.getThisSkill(13));
            else
                writer.println("Persuasion      : " + character.getThisSkill(13) + " * ");
            
            if(character.getThisSkillProf(14))
                writer.println("Religion        : " + character.getThisSkill(14));
            else
                writer.println("Religion        : " + character.getThisSkill(14) + " * ");
            
            if(character.getThisSkillProf(15))
                writer.println("Sleight of Hand : " + character.getThisSkill(15));
            else
                writer.println("Sleight of Hand : " + character.getThisSkill(15) + " * ");
            
            if(character.getThisSkillProf(16))
                writer.println("Stealth         : " + character.getThisSkill(16));
            else
                writer.println("Stealth         : " + character.getThisSkill(16) + " * ");
            
            if(character.getThisSkillProf(17))
                writer.println("Survival        : " + character.getThisSkill(17));
            else
                writer.println("Survival        : " + character.getThisSkill(17) + " * ");
            writer.println("");
            
            writer.println("Passive Perception : " + character.getPassivePerception());
            writer.println("");
            
            writer.println("________Weapon Attacks________");
            writer.println("(Assumes proficiency with weapon)");
            writer.println("(stats shown assume used in melee if has thrown property)");
            writer.println("");
            for(WeaponAttack attack : character.getAttacks())
            {
                writer.println(attack.damageString());
                writer.println(attack.attackString());
                writer.println(attack.propertyString());
            }
            writer.println("");
            writer.println("");
            if(character.getPlayerClass("Bard") > 0)
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("1st Level Spells:");
                for(String spell : character.getSpells())
                    writer.println("     " + spell);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass("Cleric") > 0)
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass("Druid") > 0)
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass("Sorceror") > 0)
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("1st Level Spells:");
                for(String spell : character.getSpells())
                    writer.println("     " + spell);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass("Wizard") > 0)
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass("Warlock") > 0)
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("1st Level Spells:");
                for(String spell : character.getSpells())
                    writer.println("     " + spell);
                writer.println("");
                writer.println("");
            }
            
            writer.println("________Class Features________");
            if(character.getPlayerClass("Cleric") > 0)
                writer.println("Cleric Domain : " + character.getClericDomain());
            if(character.getPlayerClass("Fighter") > 0)
                writer.println("Fighting Style : " + character.getFightingStyle());
            if(character.getPlayerClass("Warlock") > 0)
                writer.println("Otherworldly Patron : " + character.getOtherworldlyPatron());
            if(character.getPlayerClass("Ranger") > 0)
                writer.println("Favored Enemy : " + character.getFavoredEnemy());
            
            for(String feature : character.getClassFeatures())
                writer.println(feature);
            writer.println("");
            
            writer.println("________Racial Features________");
            for(String feature : character.getRaceFeatures())
                writer.println(feature);
            writer.println("");
            
            writer.println("________Proficiencies________");
            for(String prof : character.getProficiencies())
                writer.println(prof);
            writer.println("");
            
            writer.println("________Languages Known________");
            for(String lang : character.getLanguages())
                writer.println(lang);
            writer.println("");
            
            writer.println("________Inventory________");
            for(String item : character.getInventory())
                writer.println(item);
            
        } catch(Exception ex){}
        writer.close();
    }
}

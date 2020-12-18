import java.io.File;
import java.io.PrintWriter;

public class CharacterLatexWriter {
    PrintWriter writer;
    File characterFile;
    Character character;
    String filePath;
    public CharacterLatexWriter(String path, Character cha)
    {
        this.characterFile = new File(path);
        this.character = cha;
        this.filePath = path;
        this.writer = null;
    }

    public String latexTF(boolean tf){
        if(tf){
            return "True";
        } else{
            return "";
        }
    }

    public void createCharacterFile()
    {
        String temp;
        try{
            writer = new PrintWriter(filePath,"UTF-8");
            writer.println("\\documentclass[a4paper,openany,twocolumn]{book}");
            writer.println("\\usepackage{fontspec}");
            writer.println("\\usepackage[justified]{dnd}");
            writer.println("\\usepackage{ifthen}");
            writer.println("\\usepackage{pstricks}");
            writer.println("\\usepackage[UKenglish]{babel}");
            writer.println("\\input{../character-sheet-settings}");
            writer.println("\\input{../template/character-sheet-commands}");
            temp = this.character.getCharacterName();
            writer.println("\\CharacterName{" + temp + "}");
            temp = "";

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
            writer.println("\\Class{" + temp + "}");
            temp = this.character.getBackground();
            writer.println("\\Background{" + temp + "}");
            temp = this.character.getPlayerName();
            writer.println("\\PlayerName{" + temp + "}");
            temp = this.character.getRace();
            writer.println("\\Race{" + temp + "}");
            temp = this.character.getAlignment();
            writer.println("\\Alignment{" + temp + "}");
            temp = "" + this.character.getXP();
            writer.println("\\XP{" + temp + "}");
            temp = "" + this.character.getStrength();
            writer.println("\\StrengthScore{" + temp + "}");
            temp = "" + this.character.getStrMod();
            writer.println("\\StrengthModifier{" + temp + "}");
            temp = "" + this.character.getDexterity();
            writer.println("\\DexterityScore{" + temp + "}");
            temp = "" + this.character.getDexMod();
            writer.println("\\DexterityModifier{" + temp + "}");
            temp = "" + this.character.getConstitution();
            writer.println("\\ConstitutionScore{" + temp + "}");
            temp = "" + this.character.getConMod();
            writer.println("\\ConstitutionModifier{" + temp + "}");
            temp = "" + this.character.getIntelligence();
            writer.println("\\IntelligenceScore{" + temp + "}");
            temp = "" + this.character.getIntMod();
            writer.println("\\IntelligenceModifier{" + temp + "}");
            temp = "" + this.character.getWisdom(); 
            writer.println("\\WisdomScore{" + temp + "}");
            temp = "" + this.character.getWisMod();
            writer.println("\\WisdomModifier{" + temp + "}");
            temp = "" + this.character.getCharisma();
            writer.println("\\CharismaScore{" + temp + "}");
            temp = "" + this.character.getChaMod();
            writer.println("\\CharismaModifier{" + temp + "}");
            int[] sts = this.character.getSavingThrows();
            temp = "" + sts[0];
            writer.println("\\StrengthSavingThrowModifier{" + temp + "}");
            temp = "" + sts[1];
            writer.println("\\DexteritySavingThrowModifier{" + temp + "}");
            temp = "" + sts[2];
            writer.println("\\ConstitutionSavingThrowModifier{" + temp + "}");
            temp = "" + sts[3];
            writer.println("\\IntelligenceSavingThrowModifier{" + temp + "}");
            temp = "" + sts[4];
            writer.println("\\WisdomSavingThrowModifier{" + temp + "}");
            temp = "" + sts[5];
            writer.println("\\CharismaSavingThrowModifier{" + temp + "}");
            boolean stp[] = this.character.getSavingThrowProfs();
            boolean tempb = stp[0];
            temp = latexTF(tempb);
            writer.println("\\StrengthProficiency{" + temp + "}");
            tempb = stp[1];
            temp = latexTF(tempb);
            writer.println("\\DexterityProficiency{" + temp + "}");
            tempb = stp[2];
            temp = latexTF(tempb);
            writer.println("\\ConstitutionProficiency{" + temp + "}");
            tempb = stp[3];
            temp = latexTF(tempb);
            writer.println("\\IntelligenceProficiency{" + temp + "}");
            tempb = stp[4];
            temp = latexTF(tempb);
            writer.println("\\WisdomProficiency{" + temp + "}");
            tempb = stp[5];
            temp = latexTF(tempb);
            writer.println("\\CharismaProficiency{" + temp + "}");
            temp = "" + this.character.getThisSkill(0);
            writer.println("\\AcrobaticsSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(1);
            writer.println("\\AnimalHandlingSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(2);
            writer.println("\\ArcanaSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(3);
            writer.println("\\AthleticsSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(4);
            writer.println("\\DeceptionSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(5);
            writer.println("\\HistorySkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(6);
            writer.println("\\InsightSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(7);
            writer.println("\\IntimidationSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(8);
            writer.println("\\InvestigationSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(9);
            writer.println("\\MedicineSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(10);
            writer.println("\\NatureSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(11);
            writer.println("\\PerceptionSkillModifier{" + temp + "}");
            temp = "" + (10 + this.character.getThisSkill(11));
            writer.println("\\Perception{" + temp + "}");
            temp = "" + this.character.getThisSkill(12);
            writer.println("\\PerformanceSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(13);
            writer.println("\\PersuasionSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(14);
            writer.println("\\ReligionSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(15);
            writer.println("\\SleightOfHandSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(16);
            writer.println("\\StealthSkillModifier{" + temp + "}");
            temp = "" + this.character.getThisSkill(17);
            writer.println("\\SurvivalSkillModifier{" + temp + "}");
            tempb = this.character.getThisSkillProf(0);
            temp = latexTF(tempb);
            writer.println("\\AcrobaticsProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(1);
            temp = latexTF(tempb);
            writer.println("\\AnimalHandlingProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(2);
            temp = latexTF(tempb);
            writer.println("\\ArcanaProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(3);
            temp = latexTF(tempb);
            writer.println("\\AthleticsProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(4);
            temp = latexTF(tempb);
            writer.println("\\DeceptionProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(5);
            temp = latexTF(tempb);
            writer.println("\\HistoryProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(6);
            temp = latexTF(tempb);
            writer.println("\\InsightProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(7);
            temp = latexTF(tempb);
            writer.println("\\IntimidationProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(8);
            temp = latexTF(tempb);
            writer.println("\\InvestigationProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(9);
            temp = latexTF(tempb);
            writer.println("\\MedicineProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(10);
            temp = latexTF(tempb);
            writer.println("\\NatureProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(11);
            temp = latexTF(tempb);
            writer.println("\\PerceptionProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(12);
            temp = latexTF(tempb);
            writer.println("\\PerformanceProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(13);
            temp = latexTF(tempb);
            writer.println("\\PersuasionProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(14);
            temp = latexTF(tempb);
            writer.println("\\ReligionProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(15);
            temp = latexTF(tempb);
            writer.println("\\SleightOfHandProficiency{" + temp + "}");
            tempb = this.character.getThisSkillProf(16);
            temp = latexTF(tempb);
            writer.println("\\StealthProficiency{" + temp + "}");
            writer.println("\\Inspiration{}");
            temp = "" + this.character.getProfBonus();
            writer.println("\\Proficiency{" + temp + "}");
            temp = "" + this.character.getArmorClass();
            writer.println("\\ArmorClass{" + temp + "}");
            temp = "" + this.character.getInit();
            writer.println("\\Initiative{" + temp + "}");
            temp = "" + this.character.getSpeed();
            writer.println("\\Speed{" + temp + "}");
            temp = "" + this.character.getMaxHP();
            writer.println("\\MaxHitPoints{" + temp + "}");
            temp = "" + this.character.getCurrentHP();
            writer.println("\\CurrentHitPoints{" + temp + "}");
            temp = "" + this.character.getTempHP();
            writer.println("\\TemporaryHitPoints{" + temp + "}");
            temp = "";
            for (int[] hd : this.character.getHitDice()){
                if (temp == ""){
                    temp = temp + hd[0] + "d" + hd[1];
                }else{
                    temp = " + " + temp + hd[0] + "d" + hd[1];
                }
            }
            writer.println("\\MaxHitDice{" + temp + "}");
            // TODO Add Handling code for less than current Hit Dice
            writer.println("\\CurrentHitDice{" + temp + "}");
            int[] curr = this.character.getCurrency();
            temp = "" + curr[0];
            writer.println("\\CP{" + temp + "}");
            temp = "" + curr[1];
            writer.println("\\SP{" + temp + "}");
            temp = "" + curr[2];
            writer.println("\\GP{" + temp + "}");
            temp = "" + curr[3];
            writer.println("\\EP{" + temp + "}");
            temp = "" + curr[4];
            writer.println("\\PP{" + temp + "}");
            for(WeaponAttack attack : character.getAttacks())
            {
                temp = "\\AddWeapon{";
                temp = temp + attack.getWeaponName() + "}{";
                temp = temp + attack.getAttack() + "}{";
                String temp2 = "";
                for (int[] hd : attack.getDamage()){
                    if (temp2 == ""){
                        temp2 = temp2 + hd[0] + "d" + hd[1];
                    }else{
                        temp2 = " + " + temp2 + hd[0] + "d" + hd[1];
                    }
                }
                temp = temp + temp2 + " " + attack.getDamageType() + "}";
                writer.println(temp);
            }
            writer.println("\\begin{document}");
            writer.println("\\newgeometry{left=0cm,right=0cm,top=0cm,bottom=0cm}");
            writer.println("\\onecolumn");
            writer.println("\\input{../template/character-sheet.tex}");
            writer.println("\\end{document}");
        } catch(Exception ex){}
        writer.close();
    }
}

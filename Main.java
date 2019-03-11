import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        attractie[] attractieArray = new attractie[6];
        attractieArray[0]=new botAuto();
        attractieArray[1]=new spin();
        attractieArray[2]=new spiegelPaleis();
        attractieArray[3]=new spookHuis();
        attractieArray[4]=new hawaii();
        attractieArray[5]=new ladderKlimmen();
        Kassa kassa = new Kassa();

        Scanner reader = new Scanner(System.in);
        int attractieN=0;
        do
        {
            try{
            System.out.println("Kies een attractie: ");
            attractieN = Character.getNumericValue(reader.next().charAt(0));
            if (attractieN==Character.getNumericValue('o')){
                for(attractie a:attractieArray){
                    a.printOmzet();
                }
                kassa.printOmzet();

            }else if (attractieN==Character.getNumericValue('k')){
                for(attractie a:attractieArray){
                    a.printKaartje();
                }
                kassa.printKaartje();
            }else {
                attractieArray[attractieN - 1].draaien();
                attractieArray[attractieN - 1].omzetUpdate();
                kassa.omzetUpdate(attractieArray[attractieN - 1].getPrijs());

            }
            }
            catch(Exception e){

            }
        } while(attractieN>0);





    }
}

abstract class attractie{
    String naam;
    double prijs;
    double oppervlakte;
    int kaartje;
    abstract void draaien();
    abstract void omzetUpdate();
    abstract double getPrijs();
    abstract void printOmzet();
    abstract void printKaartje();
}
class Kassa{
    double omzet=0;
    int kaartje;
    void omzetUpdate(double prijs){
        this.omzet=this.omzet+prijs;
        this.kaartje++;
        System.out.println("De totale omzet: "+ this.omzet);


    }
    void printOmzet(){
        System.out.println("De totale omzet: "+ this.omzet);
    }
    void printKaartje(){
        System.out.println("Totaal aantal kaartje: "+ this.kaartje);
    }

}
class botAuto extends attractie{
    String naam = "Botsauto";
    double prijs = 2.5;
    double omzet=0;
    int kaartje=0;

    void draaien(){
        System.out.println("De attractie "+ naam + " draait");
    }
    void omzetUpdate(){
        this.omzet=this.omzet+prijs;
        this.kaartje=(int) (this.omzet/prijs);
        System.out.println(this.kaartje);
    }
    double getPrijs(){
        return prijs;
    }
    void printOmzet(){
        System.out.println("Omzet "+naam+" is: "+ omzet);
    }
    void printKaartje(){
        System.out.println("Aantal kaartjes "+naam+" is: "+ kaartje);
    }
}

class spin extends RisicoRijkeAttracties{
    String naam = "Spin";
    double prijs = 2.25;
    double omzet=0;
    int kaartje=0;
    void draaien(){
        System.out.println("De attractie "+ naam + " draait");
    }
    boolean opstellingsKeuring(){
        return true;
    }
    void omzetUpdate(){
        this.omzet=this.omzet+prijs;
        this.kaartje=(int) (this.omzet/prijs);
        System.out.println(this.kaartje);
    }
    double getPrijs(){
        return prijs;
    }
    void printOmzet(){
        System.out.println("Omzet "+naam+" is: "+ omzet);
    }
    void printKaartje(){
        System.out.println("Aantal kaartjes "+naam+" is: "+ kaartje);
    }
}

class spookHuis extends attractie{
    String naam = "Spookhuis";
    double prijs = 3.2;
    double omzet=0;
    int kaartje=0;
    void draaien(){
        System.out.println("De attractie "+ naam + " draait");
    }
    void omzetUpdate(){
        this.omzet=this.omzet+prijs;
        this.kaartje=(int) (this.omzet/prijs);
        System.out.println(this.kaartje);
    }
    double getPrijs(){
        return prijs;
    }
    void printOmzet(){
        System.out.println("Omzet "+naam+" is: "+ omzet);
    }
    void printKaartje(){
        System.out.println("Aantal kaartjes "+naam+" is: "+ kaartje);
    }
}

class spiegelPaleis extends attractie{
    String naam = "Spiegelpaleis";
    double prijs = 2.75;
    double omzet=0;
    int kaartje=0;
    void draaien(){
        System.out.println("De attractie "+ naam + " draait");
    }
    void omzetUpdate(){
        this.omzet=this.omzet+prijs;
        this.kaartje=(int) (this.omzet/prijs);
        System.out.println(this.kaartje);
    }
    double getPrijs(){
        return prijs;
    }
    void printOmzet(){
        System.out.println("Omzet "+naam+" is: "+ omzet);
    }
    void printKaartje(){
        System.out.println("Aantal kaartjes "+naam+" is: "+ kaartje);
    }
}

class hawaii extends RisicoRijkeAttracties{
    String naam = "Hawaii";
    double prijs = 2.9;
    double omzet=0;
    int kaartje=0;
    boolean opstellingsKeuring(){
        return true;
    }
    void draaien(){
        System.out.println("De attractie "+ naam + " draait");
    }
    void omzetUpdate(){
        this.omzet=this.omzet+prijs;
        this.kaartje=(int) (this.omzet/prijs);
        System.out.println(this.kaartje);
    }
    double getPrijs(){
        return prijs;
    }
    void printOmzet(){
        System.out.println("Omzet "+naam+" is: "+ omzet);
    }
    void printKaartje(){
        System.out.println("Aantal kaartjes "+naam+" is: "+ kaartje);
    }
}

class ladderKlimmen extends attractie implements GokAttractie{
    String naam = "Ladderklimmen";
    double prijs = 5;
    double omzet=0;
    int kaartje=0;
    void draaien(){
        System.out.println("De attractie "+ naam + " draait");
    }
    void omzetUpdate(){
        this.omzet=this.omzet+prijs;
        this.kaartje=(int) (this.omzet/prijs);
        System.out.println(this.kaartje);
    }
    double getPrijs(){
        return prijs;
    }
    void printOmzet(){
        System.out.println("Omzet "+naam+" is: "+ omzet);
    }
    void printKaartje(){
        System.out.println("Aantal kaartjes "+naam+" is: "+ kaartje);
    }
    public void kansSpelBelastingBetalen(){

    }

}

abstract class RisicoRijkeAttracties extends attractie{
    int draailimiet;
    abstract boolean opstellingsKeuring();
}

interface GokAttractie{
    void kansSpelBelastingBetalen();
}

/**
 * Write a description of class BaseDeDonnées here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseDeDonnées
{
    String AdressePhysique;
    String Usager;
    String MotPasse;

    public BaseDeDonnées(String p_AdressePhysique, String p_Usager, String p_motPasse)
    {
        this.AdressePhysique = p_AdressePhysique;
        this.Usager = p_Usager;
        this.MotPasse = p_motPasse;
    }
    
    String getAdressePhysique()
    {
        return this.AdressePhysique;
    }
    String getUsager()
    {
        return this.Usager;
    }
    String getMotPasse()
    {
        return this.MotPasse;
    }
}

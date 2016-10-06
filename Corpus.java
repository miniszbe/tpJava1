
/**
 * 
 * 
 * 
 * 
 */
public class Corpus
{
    String Statut;
    int Position;

    public Corpus(String p_Statut, int p_Position)
    {
        this.Statut = p_Statut;
        this.Position = p_Position;
    }
    
    String getStatut()
    {
        return this.Statut;
    }
    
    int getPosition()
    {
        return this.Position;
    }


}

public class Gaya
{
    Vector3D titikAcuan ;
    Vector3D arah; 
    
    public Gaya (Vector3D titikAcuan,Vector3D arah)
    {
        this.arah=arah;
        this.titikAcuan=titikAcuan;
    
       
    }
public Vector3D getArah(){
    return arah;
}
    
public Vector3D getTitikAcuan(){
    return titikAcuan;
}
    
}

public class Gabung
{
 
public int[] gabung(int[] pertama, int kedua []){
    

int [] gabung = new int[pertama.length+k­edua.length];
System.arraycopy (per­tama, 0, gabung, 0, pertama.length);
System.arraycopy (ked­ua, 0, gabung, pertama.length, kedua.length);


return gabung;
  }
}
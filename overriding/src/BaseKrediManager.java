public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;
    }

    //Eger inherit edilen bir classin degistirilmesini onlemek istesek
    // filan keywordundan istifade ede bilerik. ornek olaraq
    // public final double hesapla(double tutar{
    //          retunr tutar*1.8;
    // }
    // neticede bu classi inherit eden diger classlarda hesapla metodunu override olunmasi onlenecek
}

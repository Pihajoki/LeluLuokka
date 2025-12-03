public class App {
    public static void main(String[] args) throws Exception {
        lelu lo1 = new lo1();
        lelu lo2 = new lo2();
        vieteriauto vao1 = new vao1();
    }
} // Main Loppuu
class lelu {
    public String nimi ="";
    public int paino = 0;
            public void tulostaTiedot()
            {
            }
    }
class vieteriauto {
    int nopeus = 0;
            public void kiihdyta()
            {
            }
            public void tulostaTiedot()
            {
            }
    }
/*Tee kantaluokka Lelu, jolla on kaksi attribuuttia (esim. nimi ja paino), parametriton muodostin,
yksi muodostin kaikilla parametreilla ja metodi, joka tulostaa olion tiedot.

Tee toinen luokka - Vieteriauto, joka perii yllä tehdyn Lelu-kantaluokan.

Tee Vieteriauto-luokalle tarvittavat muodostimet.

Määrittele Vieteriauto-luokkaan attribuutti nopeus ja kiihdyta-metodi, joka kasvattaa nopeus-attribuutin arvoa yhdellä.

Tee Vieteriauto-luokalle metodi, joka tulostaa kaikki olion tiedot. Nimeä metodi saman nimiseksi kuin Lelu-luokan
“tietojen tulostus” -metodi. Ylikirjoita (override) Vieteriauton “tietojen tulostus” -metodi.

Tee olio Lelu-luokasta ja tulosta sen tiedot.

Tee olio Vieteriauto-luokasta ja tulosta sen tiedot.

Muuta jokin kantaluokan attribuutti privateksi (esim. paino). Mitä tapahtuu?

Entä, jos muutat Lelu-luokan “tietojen tulostus” -metodin näkyvyydeksi private...?

Jos intoa vielä riittää, periytä Lelu-luokasta jokin toinen luokka. */
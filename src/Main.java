import creature.Dunno;
import creature.She;
import externalsfactors.Speed;
import externalsfactors.Surfaces;

public class Main {
    public static void main(String[] args) {
        She she = new She();
        Dunno dunno = new Dunno();
        dunno.bowDown();
        she.removeTheLeashFromThePet();
        she.getPet().go(dunno, Speed.SLOWLY);
        she.getPet().sniff(dunno);
        she.getPet().sniff(dunno.getBoots());
        she.getPet().lickOnTheCheek(dunno);
        she.getPet().sit(Surfaces.FLOOR);
    }
}
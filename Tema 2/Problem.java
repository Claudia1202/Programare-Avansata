/**
 * Clasa Problem contine un vector de obiecte de tip Location si un vector de obiecte de tip Road,
 * la care se pot adauga obiecte cu ajutorul metodelor addLocation() si addRoad(), insa un obiect nu poate fi adaugat decat o singura data in vector.
 * Un drum va fi adaugat in vectorul Roads doar daca lungimea sa este mai mare sau egala cu distanta euclidiana dintre locatia de plecare si destinatia sa.
 */
public class Problem {

    private Location[] locations;
    int countL = 0;
    private Road[] roads;
    int countR = 0;

    /**
     * Constructorul clasei Problem
     */
    public Problem() {
        this.locations = new Location[20];
        this.roads = new Road[40];

    }

    /**
     * Metoda addLocation de tip boolean verifica mai intai daca locatia curenta se afla deja in vectorul de locatii locations.
     * Daca locatia este noua atunci este adaugata in vector.
     * @param loc1
     * @return true/false
     */
     public boolean addLocation(Location loc1){

        for(int i=0; i<=this.countL; i++){
            if(loc1.equals(this.locations[i])){
                return false;}
        }

        this.locations[countL]=loc1;
        countL++;
        return true;

     }

    /**
     *Metoda addRoad de tip boolean verifica mai intai daca drumul curent se afla deja in vectorul de drumuri roads.
     *Daca drumul este nou atunci urmeaza sa verificam daca lungimea sa este mai mica sau egala decat
     * distanta euclidiana dintre coordonatele locatiilor de plecare si destinatie, calculata mai jos.
     * Daca conditia este indeplinita, atunci drumul r1 este adaugat in vectorul de drumuri roads.
     * @param r1
     * @return true/false
     */
    public boolean addRoad(Road r1){

        for(int j=0; j<=this.countL; j++) {
            if (r1.equals(this.roads[j])) {
                return false;
            }
        }

        double distance= calcDist(r1.getStartLoc(), r1.getEndLoc());
        if(r1.getLength()>=distance){
        this.roads[countR]=r1;
        countR++;
        return true; }
        return false;
    }

    /**
     * Metoda de tip double calculeaza distanta euclidiana dintre locatiile de plecare si destinatie ale unui drum,
     * care mai apoi va fi comparata cu lungimea drumului respectiv, fata de care trebuie sa fie mai mare sau egala.
     * @param l1
     * @param l2
     * @return euclidian distance
     */
    public double calcDist(Location l1, Location l2){

        double dX = l2.getX() - l1.getX();
        double dY = l2.getY() - l1.getY();
        return Math.sqrt(dX*dX + dY*dY);


    }


}
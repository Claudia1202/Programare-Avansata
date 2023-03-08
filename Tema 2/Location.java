/**
 * Clasa Location este pentru locatii de tip orase, aeroporturi sau benzinarii, a caror nume si coordonate spatiale trebuie specificate cu ajutorul stterelor.
 * Obiectele de tip location pot fi comparate intre ele cu ajutorul metodei equals si afisate cu ajutorul metodei toString.
 */
public class Location {

    String name;
    double x, y;
    private Location loc;

    /**
     * Constructor pentru clasa Location
     * @param name
     * @param x
     * @param y
     */
    public Location(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;

    }

    /**
     * Setter pentru numele locatiei
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returneaza numele locatiei
     * @return name
     */
    public String getName() {
        return this.name;
    }
    /**
     * Setter pentru coordonata x a locatiei.
     * @param x
     */
    public void setX(float x) {
        this.x = x;
    }
    /**
     * Returneaza coordonata X locatiei
     * @return x
     */
    public double getX() {
        return this.x;
    }
    /**
     * Setter pentru coordonata Y locatiei
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }
    /**
     * Returneaza coordonata Y locatiei
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * Functia toString din clasa Object adaptata pentru clasa Location, pentru a afisa informatiile despre locatie sub forma unui string.
     * @return string
     */
    @Override
    public String toString() {
        return "Location:" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y + '\'';
    }

    /**
     * Functia equals din clasa Object adaptata la clasa Location compara 2 obiecte de acelasi fel(Location)
     * si returneaza true daca obiectele au aceleasi valori(name, x, y) si false altfel.
     * De asemenea, functia verifica daca obiectul cu care comparam este null sau daca acesta este de tip Location.
     * @param obj
     * @return true/false
     */
    @Override
    public boolean equals(Object obj) {

        if(obj == null) {
            return false;
        }

        else if  (!(obj instanceof Location)) {
            return false;
        }
        Location loc = (Location) obj;
        return (this.name == loc.name && this.x == loc.x && this.y==loc.y ) ;


    }
}
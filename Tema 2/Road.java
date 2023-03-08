enum TypeR {
    HIGHWAY, EXPRESS, COUNTRY
}
/**
 *
 * Clasa Road este pentru drumuri de tip autostrada, express sau locale, a caror lungime, tip, viteza maxima admisa
 * si locatii de plecare si destinatie trebuie specificate cu ajutorul setterelor.
 * Obiectele de tip road pot fi comparate intre ele cu ajutorul metodei equals si afisate cu ajutorul metodei toString.
 * */
public class Road {

    float length;
    int speed;
    TypeR type;
    private Location startLoc;
    private Location endLoc;

    /**
     * Constructor pentru clasa Road.
     * @param length
     * @param speed
     * @param type
     * @param startLoc
     * @param endLoc
     */
    public Road(float length, int speed, TypeR type, Location startLoc, Location endLoc) {
        this.length = length;
        this.type = type;
        this.speed = speed;
        this.startLoc = startLoc;
        this.endLoc = endLoc;

    }
    /**
     * Setter pentru lungimea drumului
     * @param length
     */
    public void setLength(float length) {
        this.length = length;
    }
    /**
     * Returneaza lungimea drumului
     * @return length
     */
    public float getLength() {
        return this.length;
    }
    /**
     * Setter pentru tipul drumului
     * @param type
     */
    public void setType(TypeR type) {
        this.type = type;
    }
    /**
     * Returneaza tipul drumului
     * @return type
     */
    public TypeR getType() {
        return this.type;
    }
    /**
     * Setter pentru viteza maxima admisa pe drum
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    /**
     * Returneaza viteza maxima admisa pe drum
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Returneaza locatia din care incepe drumul
     * @return startLoc
     */
    public Location getStartLoc() {
        return startLoc;
    }
    /**
     * Returneaza locatia in care se termina drumul
     * @return endLoc
     */
    public Location getEndLoc() {
        return endLoc;
    }

    /**
     * Functia toString din clasa Object adaptata pentru clasa Road, pentru a afisa informatiile despre drum sub forma unui string.
     * @return string
     */
    @Override
    public String toString() {
        return "Road:" +
                "length='" + length + '\'' +
                ", type=" + type + '\'' +
                ", speed=" + speed + '\'' +
                ", startLoc=" + startLoc + '\'' +
                ", endLoc=" + endLoc + '\'';
    }

    /**
     * Functia equals din clasa Object adaptata la clasa Road compara 2 obiecte de acelasi fel(Road)
     * si returneaza true daca obiectele au aceleasi valori(speed, length, type, startLoc, endLoc) si false altfel.
     * De asemenea, functia verifica daca obiectul cu care comparam este null sau daca acesta este de tip Road.
     * @param obj
     * @return true/false
     */
    @Override
    public boolean equals(Object obj) {

        if(obj==null) {
            return false;
        }
        else if  (!(obj instanceof Road)) {
            return false;
        }
        Road r = (Road) obj;

        return (this.length == r.length && this.type == r.type && this.speed == r.speed && this.startLoc == r.startLoc && this.endLoc == r.endLoc) ;

    }
}
/**
 * Clasa Airport este mostenitoare a clasei Locations, si are ca proprietati specifice nrTerminals, nrAirlines, name.
 */
public class Airport extends Location{


    int nrTerminals;
    int nrAirlines;
    String name;

    /**
     * Constructorul clasei Airport.
     * @param name
     * @param x
     * @param y
     */
    public Airport(String name, double x, double y) {
        super(name, x, y);
    }
}

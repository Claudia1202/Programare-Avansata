/**
 * Clasa Gasstation este mostenitoare a clasei Locations, si are ca proprietati specifice gasPrice.
 */
public class Gasstation extends Location{

    float gasPrice;

    /**
     * Constructorul clasei Gasstation.
     * @param name
     * @param x
     * @param y
     */
    public Gasstation(String name, double x, double y) {
        super(name, x, y);
    }
}

/**
 * Clasa City este mostenitoare a clasei Locations, si are ca proprietati specifice population, area.
 */
public class City extends Location{

    int population;
    double area;

    /**
     * Constructorul clasei City.
     * @param name
     * @param x
     * @param y
     */
    public City(String name, double x, double y) {
        super(name, x, y);
    }
}

enum TypeL {
    CITY, AIRPORT, GAS_STATION
}

public class Location {

   String name;
   double x, y;
   TypeL type;



    public Location(String name, TypeL type, double x, double y) {
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;

    }

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
    public void setType(TypeL type){
        this.type=type;
    }

    public TypeL getType() {
        return this.type;
    }

    public void setX(float x){
        this.x=x;
    }

    public double getX() {
        return this.x;
    }
    public void setY(double y){
        this.y=y;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Location" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", type='" + type + '\'';
    }

}
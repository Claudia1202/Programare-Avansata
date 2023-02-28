enum TypeR {
    HIGHWAY, EXPRESS, COUNTRY
}
public class Road {

    float length;
    int speed;
    TypeR type;



    public Road( float length , int speed,  TypeR type) {
        this.length = length;
        this.type = type;
        this.speed = speed;

    }

    public void setName(float length){
        this.length=length;
    }

    public float getLength() {
        return this.length;
    }
    public void setType(TypeR type){
        this.type=type;
    }

    public TypeR getType() {
        return this.type;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "Location:" +
                "length='" + length + '\'' +
                ", type=" + type + '\'' +
                ", speed=" + speed + '\'' ;
    }

}

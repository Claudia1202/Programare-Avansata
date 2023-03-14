/**
 * Clasa Designer este o specializare a clasei Person, de la care mosteneste metodele si atributele. Aceasta are insa si atribute si metode specifice.
 */
public class Designer extends Person {

    String creation;

    public Designer(String name, String specialization, String birthDay, String creation) {
        super(name, specialization, birthDay);
        this.creation = creation;
    }

    /**
     * Returneaza numele creatiei.
     * @return creation
     */
    public String getCreation() {
        return creation;
    }

    /**
     * Setter pentru numele creatiei.
     * @param creation
     */
    public void setCreation(String creation) {
        this.creation = creation;
    }
}

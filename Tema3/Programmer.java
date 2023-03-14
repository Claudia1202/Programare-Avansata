/**
 * Clasa Programmer este o specializare a clasei Person, de la care mosteneste metodele si atributele. Aceasta are insa si atribute si metode specifice.
 */
public class Programmer extends Person{

    int nrProjects;

    public Programmer(String name, String specialization, String birthDay, int nrProjects) {
        super(name, specialization, birthDay);
        this.nrProjects = nrProjects;
    }


    /**
     * Setter pentru numarul de proiecte atribuite.
     * @param projects
     */
    public void setNrProjects(int projects) {
        this.nrProjects = projects;
    }

    /**
     * Returneaza numarul de proiecte atribuite.
     * @return nrProjects
     */
    public int getNrProjects() {
        return nrProjects;
    }
}

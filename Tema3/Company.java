/**
 * Clasa Company defineste companiile la care sunt angajate mai multe persoane.
 * Acestea sunt identificabile prin nume si numar de angajati.
 */
public class Company implements Node, Comparable<Company>{

    String name;
    int nrPeople;

    /**
     * Constructorul clasei Person
     * @param name
     * @param nrPeople
     */
    Company (String name, int nrPeople){

        this.name=name;
        this.nrPeople=nrPeople;
    }

    /**
     * Metoda implementata din Interfata Node. Getter pentru numele companiei.
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Setter pentru nume.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returneaza numarul de angajati ai companiei.
     * @return
     */
    public int getNrPeople() {
        return nrPeople;
    }

    /**
     * Seteaza numarul de angajati ai companiei.
     * @param nrPeople
     */
    public void setNrPeople(int nrPeople) {
        this.nrPeople = nrPeople;
    }
    /**
     * Metoda prin care comparam 2 obiecte de tip Company.
     * @param cmp the object to be compared.
     */

    @Override
    public int compareTo(Company cmp){
        return this.name.compareTo(cmp.getName());

    }
    /**
     * Metoda cu ajutorul careia afisam un obiect de tip Company.
     * @return string
     */
    @Override
    public java.lang.String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", nrPeople=" + nrPeople +
                '}';
    }
}

import java.util.Map;
import java.util.HashMap;

/**
 * Clasa Person defineste persoanele ce lucreaza in cadrul unei companii.
 * Acestea sunt identificabile printr un nume, o specializare si o data de nastere.
 * Fiecare persoana va avea un Map care contine relatiile acesteia cu alte persoane din cadrul companiei dar si cu compania respectiva(pozitia pe care o ocupa).
 */
public class Person implements Node, Comparable<Person>{

        String name;
        String specialization;
        String birthDay;
        private Map<Node, String> relationships = new HashMap<>();

    /**
     * Constructorul clasei Person.
     * @param name
     * @param specialization
     * @param birthDay
     */
         Person(String name, String specialization,  String birthDay){
            this.name = name;
            this.specialization = specialization;
            this.birthDay = birthDay;

        }

    /**
     * Returneaza data de nastere.
     * @return birthDay
     */
        public String getBirthDay() {
            return birthDay;
        }

    /**
     * Setter pentru data de nastere
     * @param birthDay
     */
        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }
    /**
     * Setter pentru nume
     * @param name
     */
        public void setName(String name) {
            this.name = name;
        }
    /**
     * Returneaza numele. Metoda este preluata din interfata Node.
     * @return name
     */
        @Override
        public String getName() {
            return this.name;
        }
    /**
     * Setter pentru specializare
     * @param specialization
     */
        public void setSpecialization(String specialization) {
            this.specialization = specialization;
        }
    /**
     * Returneaza specializarea.
     * @return name
     */
        public String getSpecialization() {
            return this.specialization;
        }

    /**
     * Metoda prin care adaugam relatii in Map-ul fiecarei persoane.
     * @param node
     * @param value
     */
        public void addRelationship(Node node, String value) {
            relationships.put(node, value);
        }

    /**
     * Metoda prin care aflu numarul de relatii dintr-un Map, pentru a putea stabili "importanta" unei Persoane.
     * @param hashMap
     * @return hashMap.size()


     */
        public static <K, V> int getMapLength(HashMap<K, V> hashMap) {
            return hashMap.size();
        }

    /**
     * Metoda prin care comparam 2 obiecte de tip Person.
     * @param per the object to be compared.
     */
        @Override
        public int compareTo(Person per) {
            return this.name.compareTo(per.getName());
        }

    /**
     * Metoda cu ajutorul careia afisam un obiect de tip Person.
     * @return string
     */
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", specialization='" + specialization + '\'' +
                    ", birthDay='" + birthDay + '\'' +
                    '}';
        }
    }



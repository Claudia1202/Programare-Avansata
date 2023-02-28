
public class Main {

    public static void main(String[] args){

        Location l1 = new Location("Iasi", TypeL.CITY, 7.5415, 7.4551);
        Road r1 = new Road(100, 90, TypeR.COUNTRY);



        String loc1= l1.toString();
        System.out.println(loc1);

        String road1= r1.toString();
        System.out.println(r1);

    }


}

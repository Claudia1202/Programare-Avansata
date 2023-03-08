
public class Main {

    public static void main(String[] args){

        Location l1 = new Location("Iasi", 7.5415, 7.4551);
        Location l2 = new Location("Bucuresti", 2.5415, 5.4551);

        Road r1 = new Road(100, 90, TypeR.COUNTRY, l1, l2);



        String loc1= l1.toString();
        String loc2 = l2.toString();

        String road1= r1.toString();

        Problem pb = new Problem();

        pb.addLocation(l1);
        pb.addLocation(l2);
        pb.addRoad(r1);


        System.out.println(pb);


    }


}

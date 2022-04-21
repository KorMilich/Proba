public class Contacts {

    public static void main(String[] args) {
        Phone mike = new Phone();
        //mike.name = "Mike";

        mike.Phone("Mike", 2323, "Sams", 123);
        mike.showInfo();
        System.out.println();
        mike.receiveCall(mike.name);
        mike.getNumber();
        System.out.println();



        Phone jeka = new Phone();
        jeka.name = "Jeka";

       jeka.twoPhone(123,"IPhone");
       jeka.showInfo();
        System.out.println();
        jeka.receiveCall(jeka.name);
        jeka.getNumber();
        System.out.println();
       /* jeka.name = "Jeka";
        jeka.number = 2973842;
        jeka.model = "iPhone";
        jeka.weight = 140;
        jeka.showInfo();
        jeka.receiveCall(jeka.name);
        jeka.getNumber();
        System.out.println();*/




        Phone sveta = new Phone();
        sveta.name = "Sveta";
        sveta.number = 23423234;
        sveta.model = "Motorolla";
        sveta.weight = 111;
        sveta.showInfo();
        sveta.receiveCall(sveta.name);
        sveta.getNumber();
        System.out.println();




    }

}

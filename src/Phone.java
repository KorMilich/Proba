public class Phone {

   public String name;
    public int number;
    public String model;
    public int weight;

// задание Ж - коструктор без параметров
    public void onePhone(){
         twoPhone(23, "wef");
    }

// задание Е - конструктор с двумя параметрами
    public void twoPhone (int number, String model){
        this.number = number;
        this.model = model;
    }

// задание Д - конструктор с тремя параметрами
    public void threePhone (int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;


    }


    public void Phone( String name, int number, String model, int weight){
        this.name = name;
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public void showInfo(){
        System.out.println(name);
        System.out.println(number);
        System.out.println(model);
        System.out.println(weight);
    }


    public void receiveCall(String name ){
       System.out.println("Звонит " + name);
      //  return;
    }


    public int getNumber(){

        return number;
    }











}

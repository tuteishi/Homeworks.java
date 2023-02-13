package homework5AbstractClasses;

public class Phone {
   private int number;
   private String model;
   private int weight;

    public Phone (int number, String model, int weight){
       this(number, model);
       this.weight = weight;
   }
   public  Phone (int number, String model){
       this.number = number;
       this.model = model;
   }
    public  Phone (){
    }

    public static void main(String[] args) {
        Phone Samsung = new Phone();
        Samsung.number = 3254762;
        Samsung.model = "Samsung";
        Samsung.weight = 152;
        System.out.println("Number:" + Samsung.number + "\n" + "Model: " + Samsung.model +
                "\n" + "Weight: " + Samsung.weight);
        Samsung.receiveCall();
        System.out.println("Phone number: " + Samsung.getNumber() + "\n");

        Phone Nokia = new Phone();
        Nokia.number = 1654268;
        Nokia.model = "Nokia";
        Nokia.weight = 147;
        System.out.println("Number:" + Nokia.number + "\n" + "Model: " + Nokia.model +
                "\n" + "Weight: " + Nokia.weight);
        Nokia.receiveCall();
        System.out.println("Phone number: " + Nokia.getNumber() + "\n");
        
        Phone LG = new Phone();
        LG.number = 1254362;
        LG.model = "LG";
        LG.weight = 172;
        System.out.println("Number:" + LG.number + "\n" + "Model: " + LG.model +
                "\n" + "Weight: " + LG.weight);
        LG.receiveCall();
        System.out.println("Phone number: " + LG.getNumber() + "\n");

        int numbers [] = {1254359,2154836,1254875,1254693,4586932};
        sendMessage (numbers);

    }

    public  void receiveCall() {
        String name = "Veniamin";
        System.out.println("Calling " + name);
    }

    public  void receiveCall(String callerName, int callerNumber) {
        callerName = "Veniamin";
        callerNumber = 156454651;
    }

    public int getNumber () {
        int numberPhone = 1561545465;
        return  numberPhone;
    }

    public static void sendMessage (int [] numbers ) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}


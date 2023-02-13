package homework6InterfacesEnams;

 public class Robot {
  Body body;
  Head head;
  String nameRobot;
  Factory factory = new Factory();

  public Robot(String nameRobot) {
   this.head = factory.createHead();
   this.body = factory.createBody();
   this.nameRobot = nameRobot;
  }

  @Override
  public String toString() {
   return "Robot {" +
           head +
            body +
           ", nameRobot='" + nameRobot + '\'' +
           "}";
  }
 }

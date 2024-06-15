package lesson7;

public class Car {
   private Engine engine;
   private Passenger[] passengers = new Passenger[4];

   public void move(){
      // passengers[i] != null; count++
   engine.startEngine();
   System.out.println("Автомобиль поехал "+ passengers.length + "пассажирами");
   }

   public Car(Engine engine) {
      this.engine = engine;
   }
}

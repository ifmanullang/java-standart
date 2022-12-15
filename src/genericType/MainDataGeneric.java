package genericType;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Fernandez");
        System.out.println("data1 Value "+ data1.getData());

        //data1.setData(1234567); => error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(1234567);
        System.out.println("data2 Value "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data2 Value "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
        //data4.setData(new Product("Ajinomoto",2500.00));
        Product product = new Product("Obat Awet Muda",1000000.0);
        data4.setData(product);
        System.out.println("data4 Value "+ data4.getData());

        DataGeneric<Person>data5 = new DataGeneric<>();
        //data5
        Person person = new Person("Fernandez Manullang", "Medan Sumut",24);
        data5.setData(person);
        System.out.println("data5 Value " + data5.getData());

        DataGeneric<Animal>data6 = new DataGeneric<>();
        //data6
        Animal animal = new Animal("Serigala", 4);
        data6.setData(animal);
        System.out.println("data6 Value " + data6.getData());

        DataGeneric<Car>data7 = new DataGeneric<>();
        //data7
        Car car = new Car("Rubicon", 2.20000, 3);
        data7.setData(car);
        System.out.println("data7 VAlue " + data7.getData());


    }
}


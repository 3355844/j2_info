import carModel.CarBMW;

public class Main {

    public static void main(String[] args) {

        int resultOil;

        CarBMW bmw;
        bmw = new CarBMW();
        bmw.oilIn = 10;


        String col =  bmw.color;

        resultOil = bmw.addOil("A-95", 10, 15);

        System.out.println(col);
        System.out.println(resultOil);
    }
}

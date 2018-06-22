package carModel;

public abstract class CarAbs implements CarInt {

    public int oilIn;

    public String oilTypeInCar;

    public double moneyForOil;

    @Override
    public int addOil(String oilType, int oilCount, double oilPrice) {
        return oilIn + oilCount;
    }

    @Override
    public boolean checkEngine(String nameErr, int idErr) {
        return false;
    }
}

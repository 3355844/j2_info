package carModel;

public interface CarInt {

    int addOil(String oilType, int oilCount, double oilPrice);

    boolean checkEngine(String nameErr, int idErr);
}

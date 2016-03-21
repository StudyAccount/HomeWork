package moduleFour.partOne;

/**
 * Created by User on 21.03.2016.
 */
public class WrongTriangleSidesException extends Throwable {
    private double firstSideValue;
    private double secondSideValue;
    private double thirdSideValue;

    public WrongTriangleSidesException(double firstSideValue, double secondSideValue, double thirdSideValue) {
        this.firstSideValue = firstSideValue;
        this.secondSideValue = secondSideValue;
        this.thirdSideValue = thirdSideValue;
    }

    public double getFirstSideValue() {
        return firstSideValue;
    }

    public double getSecondSideValue() {
        return secondSideValue;
    }

    public double getThirdSideValue() {
        return thirdSideValue;
    }
}

package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean inequalityFirst = (firstSide < secondSide + thirdSide);
        boolean inequalitySecond = (secondSide < firstSide + thirdSide);
        boolean inequalityThird = (thirdSide < firstSide + secondSide);
        if (inequalityFirst && inequalitySecond && inequalityThird) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}

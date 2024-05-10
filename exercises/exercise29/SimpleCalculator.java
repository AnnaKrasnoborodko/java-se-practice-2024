package pl.globallogic.exercises.exercise29;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    public void setFirstNumber(double newFirstNumber) {
        this.firstNumber = newFirstNumber;
    }
    public void setSecondNumber(double newSecondNumber) {
        this.secondNumber = newSecondNumber;
    }
    public double getAdditionResult() {
       return firstNumber + secondNumber;
    }
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
}

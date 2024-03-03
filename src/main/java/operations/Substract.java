package operations;

import helper.AppState;

public class Substract implements Operations{
    private  double valueA;
    private  double valueB;

    @Override
    public AppState calculate(AppState input) {
        setValues(input.getInputString());
        input.setLastResult(this.valueA - this.valueB);
        return input;
    }

    private void setValues(String inputString){
        String[] allValues = inputString.split("-");
        this.valueA = Double.parseDouble(allValues[0]);
        this.valueB = Double.parseDouble(allValues[1]);
    }
}

package operations;

import helper.AppState;

public class InvalidOperator implements Operations{
    @Override
    public AppState calculate(AppState input) {
        throw new IllegalArgumentException("Unknown Operator");
    }
}

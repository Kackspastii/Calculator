package operations;

import helper.AppState;

public class Reset implements Operations{

    @Override
    public AppState calculate(AppState appState) {
        appState.setLastResult(0);
        appState.setInputString("");
        return appState;
    }
}

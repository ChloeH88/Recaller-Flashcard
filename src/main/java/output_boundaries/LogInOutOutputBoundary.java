package output_boundaries;

import use_case.manager.LogInOutManager;

public interface LogInOutOutputBoundary {
    void setLogInOutResult(LogInOutManager.LoggedIn loginResult);

    void presentLogInOutResult();
}

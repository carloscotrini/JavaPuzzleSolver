package recAlgoSearch;

public class recAlgoSolver<Action> {

    public State<Action> recSolve(State<Action> state) {
        for (Action act : state.nextActions()) {
            State<Action> newState = state.apply(act);
            if (newState.solved()) {
                return newState;
            } else if (newState.consistent()) {
                State<Action> resultState = recSolve(newState);
                if (resultState != null && resultState.solved()) {
                    return resultState;
                }
            }
        }

        return null;
    }
}

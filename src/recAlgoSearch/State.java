package recAlgoSearch;

import java.util.Collection;

public abstract class State<Action> {

    public abstract Collection<Action> nextActions();

    public abstract State<Action> apply(Action act);

    public abstract boolean solved();

    public abstract boolean consistent();
}

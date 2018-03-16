package sudoku;

import recAlgoSearch.State;

import java.util.Collection;

public class Sudoku extends State<Integer> {

    @Override
    public Collection<Integer> nextActions() {
        return null;
    }

    @Override
    public State<Integer> apply(Integer act) {
        return null;
    }

    @Override
    public boolean solved() {
        return false;
    }

    @Override
    public boolean consistent() {
        return false;
    }
}

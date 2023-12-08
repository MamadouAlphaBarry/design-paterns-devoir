package it.cws.meta.obs;

import java.util.ArrayList;
import java.util.List;

public class JouerObservableImpl implements JouerObservable{
    private List<EnvironmentJeuObserver>observers= new ArrayList<>();
    @Override
    public void subscribe(EnvironmentJeuObserver observer) {

    }

    @Override
    public void unsubscribe(EnvironmentJeuObserver observer) {

    }

    @Override
    public void notifyObserver() {

    }
}

package it.cws.meta.obs;

public interface JouerObservable {
    void subscribe(EnvironmentJeuObserver observer);
    void  unsubscribe(EnvironmentJeuObserver observer);
    void notifyObserver();
}

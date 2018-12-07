package patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        HomeTvSystemFacade facade = new HomeTvSystemFacade(new AudioSystem(),new DvdPlayer());
        facade.startWatchingMovie();
        facade.stopWatchingMovie();
    }
}

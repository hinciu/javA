package patterns.structural.facade;

public class HomeTvSystemFacade {

    AudioSystem audioSystem;
    DvdPlayer dvdPlayer;

    public HomeTvSystemFacade(AudioSystem audioSystem, DvdPlayer dvdPlayer) {
        this.audioSystem = audioSystem;
        this.dvdPlayer = dvdPlayer;
        this.audioSystem =audioSystem;

    }

    public void startWatchingMovie(){
        audioSystem.On();
        dvdPlayer.On();
    }

    public void stopWatchingMovie(){
        audioSystem.Off();
        dvdPlayer.Off();
    }

}


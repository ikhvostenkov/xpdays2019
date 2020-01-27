import org.jetbrains.annotations.Nullable;

public class Participant {

    private AudioState audioState;

    @Nullable
    public AudioState getAudioState() {
        return audioState;
    }

    public void setAudioState(AudioState audioState) {
        this.audioState = audioState;
    }

    public void disconnect() {

    }
}

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Conference {
    private List<Participant> participants;
    private ConferenceState state;

    @Nullable
    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @Nullable
    public ConferenceState getState() {
        return state;
    }

    public void setState(ConferenceState state) {
        this.state = state;
    }
}

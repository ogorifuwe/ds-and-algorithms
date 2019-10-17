package chatserver;

public class GroupChat extends Conversation {

    public void removeParticipant(User user) {
        participants.remove(user);
    }

    public void addParticipant(User user) {
        participant.add(user);
    }
}

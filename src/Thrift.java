public class Thrift { private String[] participantNames;
private int lengthOfParticipants;
private double amount;

public Thrift(int lengthOfParticipant, double amount){
    this.lengthOfParticipants = lengthOfParticipant;
    if (amount > 0.0){
    this.amount = amount;}
    participantNames = new String[this.lengthOfParticipants];
}

    public void setParticipantNames(String[] participantNames) {
        this.participantNames = participantNames;
    }
    public String[] getParticipantNames() {
        return participantNames;
    }

    public void setLengthOfParticipants(int lengthOfParticipants) {
        this.lengthOfParticipants = lengthOfParticipants;
    }

    public int getLengthOfParticipants() {
        return lengthOfParticipants;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }

//    public static void main(String[] args) {
//        Thrift thrift1 = new Thrift(10, 5000.00);
//        String participantNames[0] = "Wale";
//    }
}

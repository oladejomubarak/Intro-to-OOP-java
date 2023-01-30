import java.util.Arrays;

public class ThriftTest {
    public static void main(String[] args) {
        Thrift thrift1 = new Thrift(5, 5000.00);
        String[] names = thrift1.getParticipantNames();
        names [0] = "Wale";
        names [1] = "Funmi";
        names [2] = "Mub";
        names [3] = "Ola";
        names [4] = "Bolu";
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }
        String [] newParticipantNames = {"a", "b", "c", "d", "e", "f"};
        thrift1.setParticipantNames(newParticipantNames);
        for (int i = 0; i <= newParticipantNames.length -1 ; i++) {
            System.out.println(newParticipantNames[i]);
        }
    }
}

package Network_Warnings_Asn;

public class Message {


    private String machineType;
    private String machineId;
    private String warning;


    public Message(String s) {

        String[] parts = s.split(":");
        String firstPart = parts[0].toString();
        String secondPart = parts[1].toString().trim();


        machineId = firstPart.substring(firstPart.length() - 1);

        machineType = firstPart.substring(0, firstPart.length() - 1);
        warning = secondPart;

    }

    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }

    public String printMessage() {
        return  machineType + "___" + machineId + "___" + warning;
    }

    public boolean scanWarning(String keyword) {
        if (warning.startsWith(keyword + " ")) {
            return true;
        } else if (warning.endsWith(" " + keyword)) {
            return true;
        } else if (warning.contains(" " + keyword + " ")) {
            return true;
        } else if (warning.equals(keyword)) {
            return true;
        } else {
            return false;
        }
    }
}




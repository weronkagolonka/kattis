public class Aaah {
    String capability, doctorRequirement;

    public Aaah(String capability, String doctorRequirement) {
        this.capability = capability;
        this.doctorRequirement = doctorRequirement;
    }

    public void isWorth() {
        String capAs = capability.substring(0, capability.indexOf('h'));
        String docAs = doctorRequirement.substring(0, doctorRequirement.indexOf('h'));

        if (capAs.length() >= docAs.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}

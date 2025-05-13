public class SignedText {
    private String firstName;
    private String lastName;

    public SignedText(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSignature() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        return firstName.substring(0, 1) + "-" + lastName;
    }

    public String addSignature(String text) {
        String signature = getSignature();
        int index = text.indexOf(signature);

        if (index != -1) {
            return text.substring(0, index) + text.substring(index + signature.length()) + signature;
        }
        
        return text + signature; 
    }
}

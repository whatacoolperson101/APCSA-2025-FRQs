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
        
        if (text.endsWith(signature)) {
            return text; 
        }
        
        if (text.startsWith(signature)) {
            return text.substring(signature.length()) + signature; 
        }
        
        return text + signature; 
    }
}

package stringClass;

public class MainStringBuilderIrfan {
    public static void main(String[] args) {
        String firstName = "Irfan Fernandez";
        System.out.println("First Name "+ firstName);
        String lastName = "Manullang";
        System.out.println("Last Name "+ lastName);

        String namaLengkap = firstName +" "+lastName;
        System.out.println("Nama Lengkap "+ namaLengkap);

        StringBuilder builder = new StringBuilder(firstName)
                .append(" ").append(lastName);
        System.out.println("Builder "+ builder);
    }
}

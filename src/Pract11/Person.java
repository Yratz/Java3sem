import java.util.Objects;

public class Person {
    String firstname, lastname, patronymic;
    public Person(String f, String l, String p) {
        firstname = f;
        lastname = l;
        patronymic = p;
    }
    public Person(String l) {
        lastname = l;
    }

    public String getFullname() {

        if(Objects.equals(firstname, null) && Objects.equals(patronymic, null))
            return lastname;
        else {
            String fullname = new StringBuilder().append(lastname).append(" ").append(firstname.charAt(0)).append(".").append(patronymic.charAt(0)).append(".").toString();
            return fullname;
        }
    }
}

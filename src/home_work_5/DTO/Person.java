package home_work_5.DTO;

public class Person {
    private final String nick;
    private final String password;
    private final String name;

    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.name = name;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}

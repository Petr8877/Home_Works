package home_work_5.Supplier;

import home_work_5.DTO.Person;
import home_work_5.Util.PersonUtil;

import java.util.function.Supplier;

public class SupplierPerson implements Supplier<Person> {

    @Override
    public Person get() {
        return new Person(PersonUtil.createRandomNick(), PersonUtil.checkPassword(PersonUtil.createPassword()), PersonUtil.createRandomName());
    }
}

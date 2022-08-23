package home_work_5.Supplier;

import home_work_5.DTO.Animal;
import home_work_5.Util.AnimalUtil;

import java.util.function.Supplier;

public class SupplierAnimal implements Supplier<Animal> {

    @Override
    public Animal get() {
        return new Animal(AnimalUtil.checkAge(AnimalUtil.createRandomAge()), AnimalUtil.createRandomNick());
    }
}

package home_work_5;

import home_work_5.Comparators.AnimalAgeAndNickComparator;
import home_work_5.Comparators.AnimalAgeComparator;
import home_work_5.Comparators.PasswordAndNickComparator;
import home_work_5.Comparators.PasswordComparator;
import home_work_5.DTO.Animal;
import home_work_5.DTO.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import static home_work_5.Util.CollectionUtil.*;

public class Main {
    public static void main(String[] args) {

        PasswordComparator passwordComparator = new PasswordComparator();
        PasswordAndNickComparator passwordAndNickComparator = new PasswordAndNickComparator();

        AnimalAgeAndNickComparator animalAgeAndNickComparator = new AnimalAgeAndNickComparator();
        AnimalAgeComparator animalAgeComparator = new AnimalAgeComparator();

        ArrayList<Person> personArrayList = new ArrayList<>();
        long start1 = System.currentTimeMillis();
        createCollectionPerson(personArrayList, 1_000);
        long finish1 = System.currentTimeMillis();
        System.out.println(personArrayList.size());
        System.out.println("Операция: createCollectionPerson. Заняла " + (finish1 - start1) + " мс");

        testPerson(personArrayList, passwordAndNickComparator);

        LinkedList<Person> personLinkedList = new LinkedList<>();
        long start2 = System.currentTimeMillis();
        createCollectionPerson(personLinkedList, 1_000);
        long finish2 = System.currentTimeMillis();
        System.out.println(personLinkedList.size());
        System.out.println("Операция: createCollectionPerson. Заняла " + (finish2 - start2) + " мс");

        testPerson(personLinkedList, passwordComparator);

        HashSet<Person> personHashSet = new HashSet<>();
        long start3 = System.currentTimeMillis();
        createCollectionPerson(personHashSet, 1_000);
        long finish3 = System.currentTimeMillis();
        System.out.println(personHashSet.size());
        System.out.println("Операция: createCollectionPerson. Заняла " + (finish3 - start3) + " мс");

        testPerson(personHashSet, passwordAndNickComparator);

        TreeSet<Person> personTreeSet = new TreeSet<>(passwordComparator);
        long start4 = System.currentTimeMillis();
        createCollectionPerson(personTreeSet, 1_000);
        long finish4 = System.currentTimeMillis();
        System.out.println(personTreeSet.size());
        System.out.println("Операция: createCollectionPerson. Заняла " + (finish4 - start4) + " мс");

        testPerson(personTreeSet, passwordAndNickComparator);

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        long start5 = System.currentTimeMillis();
        createCollectionAnimal(animalArrayList, 1_000);
        long finish5 = System.currentTimeMillis();
        System.out.println(animalArrayList.size());
        System.out.println("Операция: createCollectionAnimal. Заняла " + (finish5 - start5) + " мс");

        testPerson(animalArrayList, animalAgeComparator);

        LinkedList<Animal> animalLinkedList = new LinkedList<>();
        long start6 = System.currentTimeMillis();
        createCollectionAnimal(animalLinkedList, 1_000);
        long finish6 = System.currentTimeMillis();
        System.out.println(animalLinkedList.size());
        System.out.println("Операция: createCollectionAnimal. Заняла " + (finish6 - start6) + " мс");

        testPerson(animalLinkedList, animalAgeAndNickComparator);

        HashSet<Animal> animalHashSet = new HashSet<>();
        long start7 = System.currentTimeMillis();
        createCollectionAnimal(animalHashSet, 1_000);
        long finish7 = System.currentTimeMillis();
        System.out.println(animalHashSet.size());
        System.out.println("Операция: createCollectionAnimal. Заняла " + (finish7 - start7) + " мс");

        testPerson(animalHashSet, animalAgeComparator);

        TreeSet<Animal> animalTreeSet = new TreeSet<>(animalAgeComparator);
        long start8 = System.currentTimeMillis();
        createCollectionAnimal(animalTreeSet, 1_000);
        long finish8 = System.currentTimeMillis();
        System.out.println(animalTreeSet.size());
        System.out.println("Операция: createCollectionAnimal. Заняла " + (finish8 - start8) + " мс");

        testPerson(animalTreeSet, animalAgeAndNickComparator);
    }


}

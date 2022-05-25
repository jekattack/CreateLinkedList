import AnimalListPackage.Animal;
import AnimalListPackage.AnimalList;
import AnimalListPackage.AnimalListItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalListTest {
    @Test
    void shouldCreateAnimalLisaTheTiger(){
        //Given
        String species = "Tiger";
        String name = "Lisa";

        //When
        Animal animal1 = new Animal(species, name);
        String actual1 = animal1.getSpecies();
        String actual2 = animal1.getName();

        //Then
        Assertions.assertEquals(species, actual1);
        Assertions.assertEquals(name, actual2);
    }

    @Test
    void shouldCreateAnimalListItemContainingLisaTheTiger(){
        //Given
        Animal lisaTheTiger = new Animal("Tiger", "Lisa");
        AnimalListItem animalListItem1 = new AnimalListItem(lisaTheTiger);

        //When
        Animal actual = animalListItem1.getValue();

        //Then
        Assertions.assertEquals(lisaTheTiger, actual);

    }

    @Test
    void shouldCreateAnimalListWith5AnimalListItems(){
        //Given
        Animal animal1 = new Animal("Tiger", "Lisa");
        Animal animal2 = new Animal("Cat", "Catalina");
        Animal animal3 = new Animal("Penguin", "Benjamin");
        Animal animal4 = new Animal("Bird", "Dirk");
        Animal animal5 = new Animal("Bob", "Rob");

        //When
        AnimalList animalList = new AnimalList(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);

        //Then
        Assertions.assertEquals(animal3, animalList.get(2));

    }

    @Test
    void shouldReturnAllAnimalsAsAString(){
        //Given
        Animal animal1 = new Animal("Tiger", "Lisa");
        Animal animal2 = new Animal("Cat", "Catalina");
        Animal animal3 = new Animal("Penguin", "Benjamin");
        Animal animal4 = new Animal("Bird", "Dirk");
        Animal animal5 = new Animal("Rob", "Bob");
        AnimalList animalList = new AnimalList(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);

        String expected = "Tiger -> Cat -> Penguin -> Bird -> Rob";

        //When
        String actual = animalList.toString();

        //Then
        Assertions.assertEquals(expected, actual);

    }
/*

    @Test
    void shouldRemoveAnimalListItemOnIndex3(){
        //Given
        Animal animal1 = new Animal("Tiger", "Lisa");
        Animal animal2 = new Animal("Cat", "Catalina");
        Animal animal3 = new Animal("Penguin", "Benjamin");
        Animal animal4 = new Animal("Bird", "Dirk");
        Animal animal5 = new Animal("Bob", "Rob");
        AnimalList animalList = new AnimalList(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);

        //When


        //Then


    }


 */
}

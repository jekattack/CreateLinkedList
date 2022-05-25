package AnimalListPackage;

public class AnimalList {

    private AnimalListItem head;

    public AnimalList(Animal newAnimal){
        AnimalListItem newAnimalItem = new AnimalListItem(newAnimal);
        this.head = newAnimalItem;
    }

    public AnimalListItem getHead(){
        return head;
    }

    public Animal get(int indexInput){

        if (indexInput==0) return head.getValue();

        AnimalListItem observatedAnimalListItem = new AnimalListItem();
        observatedAnimalListItem = this.head;

        for(int i=0; i<indexInput; i++){
            observatedAnimalListItem = observatedAnimalListItem.getNext();
        }

        return observatedAnimalListItem.getValue();

    }

    public void add(Animal newAnimal){

        AnimalListItem newAnimalListItem = new AnimalListItem(newAnimal);

        AnimalListItem lastAnimalListItem = recursiveFindLast(this.head);
        lastAnimalListItem.setNext(newAnimalListItem);

    }

    private AnimalListItem recursiveFindLast(AnimalListItem observatedAnimalListItem){

        if(observatedAnimalListItem.getNext()==null){
            return observatedAnimalListItem;
        } else {
            return recursiveFindLast(observatedAnimalListItem.getNext());
        }

    }

    public String toString(){
        AnimalListItem observatedAnimalListItem = new AnimalListItem();
        observatedAnimalListItem = this.head;

        String output = head.getValue().getSpecies();
        observatedAnimalListItem = observatedAnimalListItem.getNext();

        while(observatedAnimalListItem.getNext() != null) {
            output = output + " -> " + observatedAnimalListItem.getValue().getSpecies();
            observatedAnimalListItem = observatedAnimalListItem.getNext();
        }
        output = output + " -> " + observatedAnimalListItem.getValue().getSpecies();

        return output;
    }


    /*
    public void remove(){

    }

    public void toString(){

    }
     */
}

package AnimalListPackage;

public class AnimalListItem {

    private Animal value;
    private AnimalListItem next;

    public AnimalListItem() {
        this.value = null;
    }
    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public Animal getValue() {
        return value;
    }

    public void setNext(AnimalListItem nextAnimalListItem) {
        this.next = nextAnimalListItem;
    }

    public void setNext(){
        this.next = null;
    }

    public AnimalListItem getNext(){
        return this.next;
    }

}

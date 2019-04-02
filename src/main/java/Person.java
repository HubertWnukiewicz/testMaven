public class Person {

   private Status status;

    public Person(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;

    }
    public void printStatus(){
        System.out.println(this.status);
    }
}

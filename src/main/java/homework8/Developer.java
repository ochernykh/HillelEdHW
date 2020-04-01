package homework8;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {

    private ArrayList<String> programmingLanguages;

    public Developer() {
    }

    public Developer(int id, String name, double salary, String email, ArrayList<String> programmingLanguages) {
        super(id, name, salary, email);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("Developer.work() called");
        code();
    }

    private void code(){
        System.out.println("Codding...");
    }

    public void learn(String programmingLanguage){
        super.learn();
        if (this.programmingLanguages == null){
            ArrayList<String> languages = new ArrayList<>();
            setProgrammingLanguages(languages);
        }
        if (this.getName() == null){
            System.out.println("Undefined developer is learning " + programmingLanguage);
        }else {
            System.out.println(this.getName() + " is learning " + programmingLanguage);
        }
        this.programmingLanguages.add(programmingLanguage);
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", salary=" + this.getSalary() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", programmingLanguage=" + this.programmingLanguages +
                '}';
    }

}

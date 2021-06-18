import java.util.*;
public class DependencyInver {
    private List<Developer> developers;
    public DependencyInver(List<Developer> developers) {
        this.developers = developers;
    }
    public void implement() {
        developers.forEach(d->d.develop());
    }
    public static void main(String [] ar){
        List<Developer> developers =new ArrayList<>();
        developers.add(new BackEndDeveloper());
        developers.add(new FrontEndDeveloper());
        DependencyInver obj=new DependencyInver(developers);
        obj.implement();
    }

}
interface Developer {
    void develop();
}
class BackEndDeveloper implements Developer {
    public void develop() {
        writeJava();
    }
    private void writeJava() {
        System.out.println("I write in java");
    }
}
class FrontEndDeveloper implements Developer {
    public void develop() {
        writeJavascript();
    }
    public void writeJavascript() {
        System.out.println("I write in java Script");
    }
}
public class ClassToTreeSet implements Comparable<ClassToTreeSet>{

    private int prio;
    private String name;

    public ClassToTreeSet(int prio, String name) {
        this.prio = prio;
        this.name = name;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ClassToTreeSet o) {
        if (prio < o.prio) {
            return 1;
        } else if (prio > o.prio) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}

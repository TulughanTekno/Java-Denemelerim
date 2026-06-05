public class Faculty {

        private String name;
        private String rank;
        private Faculty supervisor;

//-----------------

    public Faculty(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSupervisorName() {
        return (supervisor != null) ? supervisor.getName() : "None";
    }

    public void setSupervisor(Faculty supervisor) {
        this.supervisor = supervisor;
    }

   








}




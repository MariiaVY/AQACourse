package task2;

public class Task {
    public static void main(String[] args) {
    }

    public class Worker {
        private String worker = "An Employee";
    }

    public class Clerk extends Worker {
        private String worker = "Clerk";
    }

    public class IT extends Worker {
        private String worker = "IT specialist";
    }

    public class Programmer extends IT {
        private String worker = "Programmer";
    }

    public class ProjectManager extends IT {
        private String worker = "Project Manager";
    }

    public class CTO extends IT {
        private String worker = "CTO";
    }

    public class OfficeManager extends Clerk {
        private String worker = "Office Manager";
    }

    public class HR extends Clerk {
        private String worker = "Recruiter";
    }

    public class Cleaner extends Clerk {
        private String worker = "Cleaner";
    }
}

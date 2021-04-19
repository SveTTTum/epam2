import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class University {
    private List<Faculty> faculties;

    public University() {
        this.faculties = faculties;
    }

    public University(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    float getMiddleMarksForUniversity(String nameSubject) throws SomeExceptions {
            ArrayList<Integer> marks = new ArrayList<>();
            for (Faculty faculty : faculties) {
                for (Group group : faculty.getGroups()) {
                    marks.addAll(group.getMarksForGroup(nameSubject));
                }
                if (faculty == null) {
                    throw new SomeExceptions("No Faculties in University");
                }
            }
            int sum = 0;
            float counter = 0;
            for (Integer mark : marks) {
                sum += mark;
                counter++;
            }
            return (float) sum / counter;
        }
}

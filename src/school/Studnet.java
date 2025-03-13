package school;

import javax.security.auth.Subject;
import java.io.StreamCorruptedException;

public class Studnet {
    private int studentId;
    private String studentName;
    private Subject majorSubjct;

    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public Student(int studentId, String studnet, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studnet;
        this.majorSubjct = majorSubject;
    }

    public int addSubjectScore(Score score) {
        scoreList.add(score);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubjct;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}

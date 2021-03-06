package model;
// Generated 19/06/2017 17:16:13 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CoursewareStudentmodule generated by hbm2java
 */
public class CoursewareStudentmodule  implements java.io.Serializable {


     private int id;
     private String moduleType;
     private String moduleId;
     private int studentId;
     private String state;
     private Double grade;
     private Date created;
     private Date modified;
     private Double maxGrade;
     private String done;
     private String courseId;

    public CoursewareStudentmodule() {
    }

	
    public CoursewareStudentmodule(int id, String moduleType, String moduleId, int studentId, Date created, Date modified, String done, String courseId) {
        this.id = id;
        this.moduleType = moduleType;
        this.moduleId = moduleId;
        this.studentId = studentId;
        this.created = created;
        this.modified = modified;
        this.done = done;
        this.courseId = courseId;
    }
    public CoursewareStudentmodule(int id, String moduleType, String moduleId, int studentId, String state, Double grade, Date created, Date modified, Double maxGrade, String done, String courseId) {
       this.id = id;
       this.moduleType = moduleType;
       this.moduleId = moduleId;
       this.studentId = studentId;
       this.state = state;
       this.grade = grade;
       this.created = created;
       this.modified = modified;
       this.maxGrade = maxGrade;
       this.done = done;
       this.courseId = courseId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getModuleType() {
        return this.moduleType;
    }
    
    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }
    public String getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public Double getGrade() {
        return this.grade;
    }
    
    public void setGrade(Double grade) {
        this.grade = grade;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }
    public Double getMaxGrade() {
        return this.maxGrade;
    }
    
    public void setMaxGrade(Double maxGrade) {
        this.maxGrade = maxGrade;
    }
    public String getDone() {
        return this.done;
    }
    
    public void setDone(String done) {
        this.done = done;
    }
    public String getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }




}



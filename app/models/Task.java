package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Entity
public class Task extends Model {


    public static Model.Finder<Long, Task> find = new Model.Finder<Long,Task>(Task.class);


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;


    String content;
    String name;

    Date creationDate;
    Date updatedDate;



    public Task(Long id, String content, Date creationDate, Date updatedDate,String name) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
        this.updatedDate =updatedDate;
        this.name = name;
    }



    public Long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public User getName() {
        return name;
    }



    public void setId(Long id) {
        this.id = id;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public void setCreationDate (Date creationDate) {
        this.creationDate = creationDate;
    }


    public void setUpdatedDate (Date updatedDate) {
        this.updateddDate = updatedDate;
    }

 public void name (String name) {
        this.name = name;
    }


}
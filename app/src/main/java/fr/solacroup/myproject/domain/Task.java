package fr.solacroup.myproject.domain;

import java.util.Date;

public class Task {
    private Date date;
    private String title;
    private Category category;
    private Priority priority;
    private Boolean done = false;
    private Date dateStart;
    private Date dateEnd;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Task() {
    }

    public Task(String title, Category category, Priority priority) {
        this.title = title;
        this.date = new Date();
        if(category == null){
            category = Category.PERSONNEL;
        }else {
            this.category = category;
        }
        if(priority == null){
            this.priority = Priority.LOW;
        }else {
            this.priority= priority;
        }
    }
    public Task(Date date, String title, Category category, Priority priority, Date dateStart, Date dateEnd) {
        this(title,category,priority);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }
}

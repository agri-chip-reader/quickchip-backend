package data.entities;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "path")
    private String path;

    @Column(name = "userinsert")
    private String userInsert;

    @Column(name = "date")
    private Date date;

    public Images(String path, String userInsert) {
        this.path = path;
        this.userInsert = userInsert;
        this.date=new Date(LocalDate.now().getYear(),LocalDate.now().getMonthValue(),LocalDate.now().getDayOfMonth());
    }

    public Images() {}

    public long getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getUserInsert() {
        return userInsert;
    }

    public Date getDate() {
        return date;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setUserInsert(String userInsert) {
        this.userInsert = userInsert;
    }
}

package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;
@Entity
public class BookEntity {

    @Id
    private int id;
    private String name;
    private int pageCount;
    private String topic;
    private String authorName;
    @Temporal(TemporalType.DATE)
    private Date publishDate;

    public BookEntity() {
    }

    public BookEntity(int id, String name, int pageCount, String topic, String authorName, Date publishDate) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.topic = topic;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", topic='" + topic + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}

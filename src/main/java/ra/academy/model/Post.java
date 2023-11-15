package ra.academy.model;

public class Post {
    private String image,title,content,author;

    public Post() {
    }

    public Post(String image, String title, String content, String author) {
        this.image = image;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

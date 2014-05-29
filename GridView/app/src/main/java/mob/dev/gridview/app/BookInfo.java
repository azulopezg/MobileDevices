package mob.dev.gridview.app;

/**
 * Created by azu on 29/05/14.
 */
public class BookInfo {
    private long id;
    private String name;
    private String autor;
    private int resourceImage;
    private String url;

    public BookInfo(long id, String name, String autor, int resourceImage, String url) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.resourceImage = resourceImage;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getResourceImage() {
        return resourceImage;
    }

    public String getUrl() {
        return url;
    }
}

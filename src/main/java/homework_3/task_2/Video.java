package homework_3.task_2;

public class Video {
    private String videoPath;
    private String id;

    public Video(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

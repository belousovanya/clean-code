package homework_3.task_2;

public interface VideoAdapter {
    Video convert(String videoPath);

    boolean supports(String videoPath);

    default Video convertToMp4(String videoPath) {
        int index = videoPath.lastIndexOf(".");
        String mp4path = videoPath.substring(0, index) + ".mp4";

        return new Video(mp4path);
    }
}
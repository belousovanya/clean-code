package homework_3.task_2;

public class WmvVideoAdapter implements VideoAdapter {
    @Override
    public Video convert(String videoPath) {
        return convertToMp4(videoPath);
    }

    @Override
    public boolean supports(String videoPath) {
        return videoPath.toLowerCase().endsWith(".wmv");
    }
}
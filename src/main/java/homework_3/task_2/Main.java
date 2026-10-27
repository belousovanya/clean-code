package homework_3.task_2;

public class Main {
    public static void main(String[] args) {
        VideoAdapter aviVideoAdapter = new AviVideoAdapter();
        VideoAdapter movVideoAdapter = new MovVideoAdapter();
        VideoAdapter wmvVideoAdapter = new WmvVideoAdapter();

        VideoService videoService = new VideoService(aviVideoAdapter, movVideoAdapter, wmvVideoAdapter);

        String videoPath = "path/to/example.avi";

        Video video = videoService.uploadVideo(videoPath);
        System.out.println("Видео после конвертации: " + video.getVideoPath());

        Stream stream = videoService.streamVideo(video.getId());

        System.out.println("Видео для стриминга: " + stream.getVideo().getVideoPath());
    }
}

package homework_3.task_2;

import java.util.*;

public class VideoService {

    private final List<VideoAdapter> adapters;
    private final Map<String, Video> videos = new HashMap<>();

    public VideoService(VideoAdapter... adapters) {
        this.adapters = Arrays.asList(adapters);
    }

    public Video uploadVideo(String videoPath) {
        for (VideoAdapter adapter : adapters) {
            if (adapter.supports(videoPath)) {
                Video video = adapter.convert(videoPath);
                String id = UUID.randomUUID().toString();
                video.setId(id);
                videos.put(id, video);
                return video;
            }
        }
        throw new IllegalArgumentException("Неподдерживаемый формат");
    }

    public Stream streamVideo(String id) {
        Video video = videos.get(id);

        if (video == null) {
            throw new IllegalArgumentException("Видео не найдено");
        }

        return new Stream(video);
    }
}

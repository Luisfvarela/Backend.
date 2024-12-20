package culturemedia.service;

import culturemedia.exception.DurationNotValidException;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;

import java.util.List;

public interface CulturotecaService {
    List<Video> findAll() throws VideoNotFoundException;
    Video save(Video video);
    View save(View view);
    List<Video> find(String title) throws VideoNotFoundException;
    List<Video> find(Double fromDuration, Double toDuration) throws DurationNotValidException;
}


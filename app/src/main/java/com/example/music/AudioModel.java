package com.example.music;

import java.io.Serializable;

public class AudioModel implements Serializable {
    String path;
    String title;
    String Duration;

    public AudioModel(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        Duration = duration;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }
}

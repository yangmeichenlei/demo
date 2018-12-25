package com.media.form.video;

import java.util.List;

public class VideoTagBindForm {

private List<String> videoList;

private List<String> tagList;

public List<String> getVideoList() {
return videoList;
}

public void setVideoList(List<String> videoList) {
this.videoList = videoList;
}

public List<String> getTagList() {
return tagList;
}

public void setTagList(List<String> tagList) {
this.tagList = tagList;
}

@Override
public String toString() {
return "VideoTagBindForm [videoList=" + videoList + ", tagList=" + tagList + "]";
}



}

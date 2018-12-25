package com.media.form.video;

import java.util.List;

public class VideoFilterTagForm {

    private VideoFilterForm videoFilterForm;
    
    private List<String> tagIdsList;

   

    public VideoFilterForm getVideoFilterForm() {
        return videoFilterForm;
    }

    public void setVideoFilterForm(VideoFilterForm videoFilterForm) {
        this.videoFilterForm = videoFilterForm;
    }

    public List<String> getTagIdsList() {
        return tagIdsList;
    }

    public void setTagIdsList(List<String> tagIdsList) {
        this.tagIdsList = tagIdsList;
    }
    
}

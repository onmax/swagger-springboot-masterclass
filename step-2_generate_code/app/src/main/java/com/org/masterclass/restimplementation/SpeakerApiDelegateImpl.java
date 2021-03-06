package com.org.masterclass.restimplementation;

import com.org.masterclass.model.Speaker;
import com.org.masterclass.model.SpeakerBean;
import com.org.masterclass.modelimplementation.SpeakerImpl;
import com.org.masterclass.rest.SpeakersApiDelegate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class SpeakerApiDelegateImpl implements SpeakersApiDelegate {
    @Override
    public ResponseEntity<Speaker> getSpeaker(Integer speakerId) {
        Speaker speaker = new Speaker();
        speaker.setId(speakerId);
        speaker.setName("Petros");
        speaker.setEmail("petros@mail.com");
        speaker.setAge(20);
        return ResponseEntity.ok(speaker);
    }

    @Override
    public ResponseEntity<Speaker> postSpeaker(SpeakerBean bean) {
        SpeakerImpl speaker = new SpeakerImpl();
        speaker.fromBean(bean);
        return ResponseEntity.ok(speaker);
    }
}

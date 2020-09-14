package com.org.masterclass.modelimplementation;

import com.org.masterclass.model.Speaker;
import com.org.masterclass.model.SpeakerBean;

public class SpeakerImpl extends Speaker {
    Speaker fromBean(SpeakerBean bean) {
        this.setId(bean.getId());
        this.setEmail(bean.getEmail());
        this.setAge(bean.getAge());
        this.setName(bean.getName());
        return this;
    }
}
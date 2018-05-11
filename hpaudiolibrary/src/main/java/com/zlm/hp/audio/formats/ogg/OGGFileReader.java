package com.zlm.hp.audio.formats.ogg;

import android.util.Log;

import com.zlm.hp.audio.AudioFileReader;
import com.zlm.hp.audio.TrackInfo;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.ogg.OggFileReader;

public class OGGFileReader extends AudioFileReader {
    protected TrackInfo readSingle(TrackInfo trackInfo) {
        try {
            OggFileReader reader = new OggFileReader();
            AudioFile af1 = reader.read(trackInfo.getFile());
            GenericAudioHeader audioHeader = (GenericAudioHeader) af1
                    .getAudioHeader();
            copyHeaderFields(audioHeader, trackInfo);
        } catch (Exception e) {
            Log.e("OGGFileReader", e.toString());
        }
        return trackInfo;
    }

    public boolean isFileSupported(String ext) {
        return ext.equalsIgnoreCase("ogg");
    }

    @Override
    public String getSupportFileExt() {
        return "ogg";
    }

}

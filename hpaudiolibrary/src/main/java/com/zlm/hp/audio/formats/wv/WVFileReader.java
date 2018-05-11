package com.zlm.hp.audio.formats.wv;


import android.util.Log;

import com.wavpack.decoder.WavPackUtils;
import com.wavpack.decoder.WavpackContext;
import com.zlm.hp.audio.AudioFileReader;
import com.zlm.hp.audio.TrackInfo;

import java.io.File;
import java.io.RandomAccessFile;


public class WVFileReader
        extends AudioFileReader {
    protected TrackInfo readSingle(TrackInfo trackInfo) {
        try {
            RandomAccessFile ras = new RandomAccessFile(new File(
                    trackInfo.getFilePath()), "r");

            WavpackContext wpc = WavPackUtils.WavpackOpenFileInput(ras);

            trackInfo.setChannels(WavPackUtils.WavpackGetReducedChannels(wpc));
            int frameSize = trackInfo.getChannels() *
                    2;
            trackInfo.setFrameSize(frameSize);
            trackInfo.setTotalSamples(WavPackUtils.WavpackGetNumSamples(wpc));
            trackInfo.setSampleRate((int) WavPackUtils.WavpackGetSampleRate(wpc));
            trackInfo.setChannels(WavPackUtils.WavpackGetReducedChannels(wpc));
            trackInfo.setBitrate((int) (ras.length() / trackInfo.getTotalSamples() / 1000 * 8));
            trackInfo.setCodec("WavPack");
            trackInfo.setStartPosition(0l);

            ras.close();

        } catch (Exception e) {
            Log.e("WVFileReader", e.toString());
        }
        return trackInfo;
    }


    public boolean isFileSupported(String ext) {
        return ext.equalsIgnoreCase("wv");
    }

    @Override
    public String getSupportFileExt() {
        return "wv";
    }

}

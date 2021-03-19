package patterns.structre.bridge.impl;

import patterns.structre.bridge.Device;

public class Radio implements Device {
    @Override
    public void setEnable(boolean enable) {

    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int percent) {

    }

    @Override
    public int getChannel() {
        return 0;
    }

    @Override
    public void setChannel(int channel) {

    }
}

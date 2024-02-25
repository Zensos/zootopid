package com.zootopid.zone;

public abstract class Zone {
    private String zone_name;

    public Zone(String zone_name) {
    this.zone_name = zone_name;
    }

    public String getZoneName() {
        return zone_name;
    }

}

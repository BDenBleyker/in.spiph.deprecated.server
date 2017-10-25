/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.server.trackercom;

import in.spiph.info.Tracker;
import in.spiph.packets.iplookup.IpLookupResponsePacket;

/**
 *
 * @author Bennett.DenBleyker
 */
public class MocTrackerCom implements ITrackerCom {

    String ip = "127.0.0.1";
    
    @Override
    public boolean sendIp(Tracker tracker) {
        return true;
    }

    @Override
    public IpLookupResponsePacket getIp(long id) {
        return new IpLookupResponsePacket("127.0.0.1");
    }
    
}

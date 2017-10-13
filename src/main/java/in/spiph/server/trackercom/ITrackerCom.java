/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.server.trackercom;

import in.spiph.packets.iplookup.IpLookupPacket;
import in.spiph.packets.iplookup.IpLookupResponsePacket;

/**
 *
 * @author Bennett.DenBleyker
 */
public interface ITrackerCom {
    public IpLookupResponsePacket sendIp();
    public IpLookupPacket getIp(long id);
}

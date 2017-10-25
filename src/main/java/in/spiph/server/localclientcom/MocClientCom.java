/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.server.localclientcom;

import in.spiph.info.Client;

/**
 *
 * @author Bennett.DenBleyker
 */
public class MocClientCom implements IClientCom {

    @Override
    public boolean authenticate(Client client) {
        return IClientCom.ID2PKEYMAP.getOrDefault(client.getId(), 0L) == 0L;
    }
    
}

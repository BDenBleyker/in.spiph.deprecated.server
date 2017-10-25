/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.info;

import java.net.URL;

/**
 *
 * @author Bennett.DenBleyker
 */
public class Client {

    final long id;
    final URL ip;

    public Client(long id, URL ip) {
        this.id = id;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public URL getIp() {
        return ip;
    }
    
    

}

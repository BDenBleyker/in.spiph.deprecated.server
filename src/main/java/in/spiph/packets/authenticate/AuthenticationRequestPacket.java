/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.packets.authenticate;

import in.spiph.packets.APacket;

/**
 *
 * @author Gabriel.Maxfield
 */
public class AuthenticationRequestPacket extends APacket {

    public AuthenticationRequestPacket() {
        super(5, new char[]{});
    }

}

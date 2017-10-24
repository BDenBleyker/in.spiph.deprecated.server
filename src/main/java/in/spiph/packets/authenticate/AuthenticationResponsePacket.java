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
public class AuthenticationResponsePacket extends APacket {

    public AuthenticationResponsePacket(char[] data) {
        super(6, data);
    }

    public AuthenticationResponsePacket(long pKey) {
        super(6, new char[]{(char) (pKey >> 56), (char) (pKey >> 48), (char) (pKey >> 40), (char) (pKey >> 32), (char) (pKey >> 24), (char) (pKey >> 16), (char) (pKey >> 8), (char) pKey});
    }
}

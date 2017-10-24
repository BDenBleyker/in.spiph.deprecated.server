/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.server.servercom;

import in.spiphi.info.Page;
import in.spiphi.info.Post;
import in.spiphi.info.Server;
import java.util.List;

/**
 *
 * @author Gabriel.Maxfield
 */
public interface IServerCom {
    public Page getPage(Server server);
    public List<Post> getPosts(Server server);
}

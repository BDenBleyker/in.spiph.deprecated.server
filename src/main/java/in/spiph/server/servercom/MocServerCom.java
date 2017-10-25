/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.server.servercom;

import in.spiph.info.Page;
import in.spiph.info.Post;
import in.spiph.info.Server;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Bennett.DenBleyker
 */
public class MocServerCom implements IServerCom {

    Page page;
    List<Post> posts = new ArrayList();
    
    public MocServerCom(Page page, Post...posts) {
        this.page = page;
        this.posts.addAll(Arrays.asList(posts));
    }
    
    public MocServerCom(Page page, List<Post> posts) {
        this.page = page;
        this.posts.addAll(posts);
    }
    
    @Override
    public Page getPage(Server server) {
        return page;
    }

    @Override
    public List<Post> getPosts(Server server) {
        return posts;
    }
    
}

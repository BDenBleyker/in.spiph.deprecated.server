/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.info;

import java.util.List;

/**
 *
 * @author Bennett.DenBleyker
 */
public class Page {

    public final List<Post> posts;
    public final String source;

    public Page(List<Post> posts, String source) {
        this.posts = posts;
        this.source = source;
    }

}

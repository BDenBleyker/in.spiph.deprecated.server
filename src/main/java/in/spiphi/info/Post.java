/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiphi.info;

import java.time.ZonedDateTime;

/**
 *
 * @author Gabriel.Maxfield
 */
public class Post {

    final ZonedDateTime time;
    final String source;

    public Post(ZonedDateTime time, String source) {
        this.time = time;
        this.source = source;
    }

}

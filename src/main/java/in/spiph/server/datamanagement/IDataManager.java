/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.server.datamanagement;

import java.io.File;

/**
 *
 * @author Bennett.DenBleyker, Gabriel.Maxfield
 */
public interface IDataManager {
    public void saveFile(String path, String name, String data);
    public String getFile(String path, String name);
}

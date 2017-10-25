/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * SAVE MEE!!!!!
 */
package in.spiph.server.datamanagement;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabriel.Maxfield
 */
public class MocFileManager implements IDataManager {//Should this be a moc?

    @Override
    public void saveFile(String path, String name, String data) {
        try {
            BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(path + name));
            outStream.write(data.getBytes());
        } catch (FileNotFoundException ex) {
            System.err.println("ERROR: File Not Found!");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.err.println("ERROR: Could not write to file \"" + path + name + "\"");
            ex.printStackTrace();
        }
    }

    @Override
    public String getFile(String path, String name) {
        try {
            Scanner reader = new Scanner(new FileInputStream(new File(path + name)));
            String result = "";
            int i = 0;
            while (reader.hasNextLine()) {
                result += reader.nextLine() + "\n";
            }
            return result;
        } catch (FileNotFoundException ex) {
            System.err.println("ERROR: File Not Found!");
            ex.printStackTrace();
            return ""; //Return null?
        }
    }

}

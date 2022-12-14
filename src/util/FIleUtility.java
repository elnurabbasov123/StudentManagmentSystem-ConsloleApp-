package util;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIleUtility {
    public static boolean writeObjectToFile(Object object, String name) throws RuntimeException {
        try (FileOutputStream fout = new FileOutputStream(name);
             ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(object);
            return true;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public static Object readFileDeserialize(String name)  {
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }
}

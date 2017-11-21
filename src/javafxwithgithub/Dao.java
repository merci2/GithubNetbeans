package javafxwithgithub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao {
    
    //?warum final?
    static final String DB_JSON = "db.json";
    
    public List<Datensatz> findAll()
    {
        return readJson();
    }
    
    void saveDatensatz(Datensatz ds)
    {
        List<Datensatz> list = readJson();//Liste anlegen, json auslesen
        list.add(ds);//neuen Datensatz adden
        writeJson(list);//json-Datei ueberschreiben
    }
    
    List<Datensatz> readJson()
    {
        try(Reader reader = new InputStreamReader(new FileInputStream(DB_JSON), ("UTF-8")))
        {
            Gson gson = new GsonBuilder().create();
            Type type = new TypeToken<List<Datensatz>>(){}.getType();//erklären lassen ?
            List<Datensatz> jsonVocList = gson.fromJson(reader, type);
            return jsonVocList;
        } 
        catch(IOException e)
        {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
    void writeJson(List<Datensatz> list)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try
        {
            Type type = new TypeToken<List<Datensatz>>(){}.getType();
            String string = gson.toJson(list, type);
            if(Files.exists(Paths.get(DB_JSON)))
            {
                Files.delete(Paths.get(DB_JSON));
            }
            Files.write(Paths.get(DB_JSON), string.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

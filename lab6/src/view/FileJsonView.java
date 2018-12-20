package view;
import java.io.File;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import model.JsonRecord;
import model.Patient;

public class FileJsonView {
    private ObjectMapper mapper = new ObjectMapper();
    private JsonRecord listRec;

    public FileJsonView() {
        this.listRec=new JsonRecord();
        this.mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public void addRecord(Patient rec)
    {
        this.listRec.addRecord(rec);
    }

    public void writeJson(String path){
        try {

            mapper.writeValue(new File(path), listRec.getRecords());
        }
        catch(JsonGenerationException exc) {
            exc.printStackTrace();
        }
        catch(JsonMappingException exc) {
            exc.printStackTrace();
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }

    }

    public void writeJson(String path,Patient p){
        try {

            mapper.writeValue(new File(path), p);
        }
        catch(JsonGenerationException exc) {
            exc.printStackTrace();
        }
        catch(JsonMappingException exc) {
            exc.printStackTrace();
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }

    }

        public  Patient ReadJson(String path)throws IOException,ClassCastException{

            Patient temp = (Patient) mapper.readValue(new File(path), Patient.class);


                return temp;



        }





}


    //    public static void main(String[] args) {
//        //private Map<String, SomeFile> pool;
//
//
//
//        ObjectMapper mapper = new ObjectMapper();
//        // Для вывода с отступами
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//        try {
//            // Здесь происходит самая главная магия
//            mapper.writeValue(new File("some_files.json"), );
//        }
//        catch(JsonGenerationException exc) {
//            exc.printStackTrace();
//        }
//        catch(JsonMappingException exc) {
//            exc.printStackTrace();
//        }
//        catch(IOException exc) {
//            exc.printStackTrace();
//        }
//    }


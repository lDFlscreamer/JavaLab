package model;

import java.util.ArrayList;
import java.util.Map;

public class JsonRecord {
    private String path;

    private ArrayList<Patient> records;
    private boolean putInEnd;


    public JsonRecord() {
        records = new ArrayList<Patient>();
    }

    public JsonRecord(String path, boolean putInEnd) {
        this();
        setPath(path);
        setPutInEnd(putInEnd);
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPutInEnd(boolean putInEnd) {
        this.putInEnd = putInEnd;
    }

    public void addRecord(Patient record) {
        records.add(record);
    }

    public ArrayList<Patient> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Patient> records) {
        this.records = records;
    }
}



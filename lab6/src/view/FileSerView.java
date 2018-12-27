package view;

import model.Patient;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileSerView implements FileInputInterface ,FileOutInterface {

    private ObjectOutputStream out=null;
    private ObjectInputStream in=null;

    public FileSerView(String path,String fileName) throws IOException{

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path + "\\" + fileName,true));
        this.out = outputStream;
        FileInputStream fiStream = new FileInputStream(path + "\\" + fileName);
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        this.in = objectStream;
    }

    @Override
    public Patient readNextPatient() throws IOException,ClassNotFoundException {
        return (Patient)in.readObject();
    }

    @Override
    public void startStreamToInputFile(String path, String fileName) {

    }

    @Override
    public void closeInputStreame() throws IOException {
        in.close();
    }

    @Override
    public void writeNextPatient(Patient obj) throws IOException {
        out.writeObject(obj);

    }

    @Override
    public void startStreamToOutFile(String path) {

    }

    @Override
    public void closeOutStreame() throws IOException {
    out.close();
    }
}

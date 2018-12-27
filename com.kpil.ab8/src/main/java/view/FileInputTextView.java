package view;

import model.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInputTextView implements FileInputInterface ,FileOutInterface{
    private static final Logger log= LogManager.getLogger(FileInputTextView.class);
  private   DataOutputStream dataOutputStream;
   private DataInputStream dataInputStream;


    public FileInputTextView(String path,String fileName) throws FileNotFoundException{
       log.debug("create"+this.getClass());
        this.dataOutputStream = new DataOutputStream(
                                                new BufferedOutputStream(
                                                        new FileOutputStream(path + "\\" + fileName)));
       this.dataInputStream = new DataInputStream(
                                                new BufferedInputStream(
                                                        new FileInputStream(path + "\\" + fileName)));

    }

    @Override
    public void startStreamToInputFile(String path, String fileName) {

    }

    @Override
    public void startStreamToOutFile(String path) {

    }



    @Override
    public Patient readNextPatient() throws IOException, ClassNotFoundException ,NullPointerException{

            String name;
            String surname;
            String patronimic;
            String diagnosis;
            Patient result;

            name = dataInputStream.readUTF();

            surname = dataInputStream.readUTF();


            patronimic = dataInputStream.readUTF();

            diagnosis = dataInputStream.readUTF();

            result= new Patient(name,surname,patronimic,diagnosis);
            return result;




    }

    @Override
    public void writeNextPatient(Patient obj) throws IOException {
        this.dataOutputStream.writeUTF(obj.getName().toString());
        this.dataOutputStream.writeUTF(obj.getSurname().toString());
        this.dataOutputStream.writeUTF(obj.getPatronimic().toString());
        this.dataOutputStream.writeUTF(obj.getDiagnosis().toString());
        this.dataOutputStream.flush();

    }

    @Override
    public void closeInputStreame() throws IOException {
        this.dataInputStream.close();
    }

    @Override
    public void closeOutStreame() throws IOException {
        this.dataOutputStream.close();
    }
}

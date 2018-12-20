package view;

import model.Patient;

import java.io.IOException;

public interface FileInputInterface {

  public   Patient readNextPatient () throws IOException, ClassNotFoundException;
  public    void  startStreamToInputFile(String path,String fileName);
  public  void closeInputStreame() throws IOException;
}

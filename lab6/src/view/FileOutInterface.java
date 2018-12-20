package view;

import model.Patient;

import java.io.IOException;

public interface FileOutInterface {
    public void writeNextPatient (Patient obj) throws IOException;
    public    void  startStreamToOutFile(String path);
    public  void closeOutStreame() throws IOException;
}

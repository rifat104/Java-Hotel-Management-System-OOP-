import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager<T> { //Generic type t to allow store data
    private final String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    // Load data from file
    public List<T> loadData() { // read information
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<T>) ois.readObject(); //error handle
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    // Save data to file
    public void saveData(List<T> data) { //write information
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
        } catch (IOException e) {
            System.out.println("Error saving data to file: " + fileName);
        }
    }
}

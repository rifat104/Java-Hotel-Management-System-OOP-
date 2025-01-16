import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager<T> {
    private final String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    // Load data from file
    public List<T> loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<T>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    // Save data to file
    public void saveData(List<T> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
        } catch (IOException e) {
            System.out.println("Error saving data to file: " + fileName);
        }
    }
}

package store;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private static ArrayList<Shelf> shelves;

    public Warehouse() {
        shelves = new ArrayList<Shelf>();
    }

    //receive(prod, loc)
    public void receive(Product prod, String loc){
        shelves.add(new Shelf(loc, prod));
    }

    //dispatch(prod)
    public String dispatch(Product prod){
        for (Shelf shelf : shelves){
            if(shelf.getProduct().equals(prod)){
                shelves.remove(shelf);
                return shelf.getShelfName();
            }
        }
        return null;
    }

    //getItemCount
    public Integer getItemCount(Product prod) {
        int counter = 0;
        for(Shelf shelf : shelves){
            if(shelf.getProduct().equals(prod)){
                counter += 1;
            }
        }
        return counter;
    }

    public void saveDataToCSV(String filePath) {
        File file = new File(filePath);
            try {
                FileWriter outputfile = new FileWriter(file);
                CSVWriter writer = new CSVWriter(outputfile);
                List<String[]> data = new ArrayList<String[]>();
                data.add(new String[]{"ShelfName", "Product"});

                for (Shelf shelf : shelves) {
                    data.add(new String[]{shelf.getShelfName(), shelf.getProduct().toString()});
                }
                writer.writeAll(data);
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
}//end of Warehouse
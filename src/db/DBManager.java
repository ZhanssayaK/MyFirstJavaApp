package db;

import model.Staff;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Staff> staffArrayList = new ArrayList<>();

    static {
        staffArrayList.add(new Staff("Ilyas", "Zhuanyshev", "IT", 55000));
        staffArrayList.add(new Staff("Aybek", "Bagit", "Management", 65000));
        staffArrayList.add(new Staff("Alibek", "Serikov", "HR", 35000));
        staffArrayList.add(new Staff("Serzhan", "Berikov", "IT", 80000));
    }

    public static ArrayList<Staff> getAllStaff(){
        return staffArrayList;
    }
}

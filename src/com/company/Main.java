package com.company;

import com.company.models.Room;
import com.company.models.RoomCategory;
import com.company.models.RoomType;
import com.company.models.User;
import com.company.persistance.ModelManagerSingleton;
import com.company.persistance.RoomObjectManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        view.init();
    }

}

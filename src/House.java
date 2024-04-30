import java.io.File;
import java.util.*;
public class House {
    HouseType type;
    String name;
    double price;
    int numberOfBeds;
    int numberOfRooms;
    int numberOfGuests;
    int numberOfBathroom;
    String Address;
    boolean petFriendly;
    boolean isAvaliable;
    PhotoAlbum photoAlbum;
    public House(String type, double p, String address, int r, int g, int b, String name, boolean f){
        this.name=name;
        this.price=p;
        this.numberOfBeds=r;
        this.numberOfRooms=g;
        this.numberOfGuests=b;
        this.Address=address;
        this.petFriendly=f;
        this.type = HouseType.valueOf(type);
        photoAlbum= new PhotoAlbum();
    }
    
    public HouseType getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getNumberOfBeds(){
        return numberOfBeds;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public int getNumberOfGuests(){
        return numberOfGuests;
    }

    public int getNumberOfBathroom(){
        return numberOfBathroom;
    }

    public String getAddress(){
        return Address;
    }

    public boolean isPetFriendly(){
        return petFriendly;
    }

    public void addPhotoAlbum(String relativePath){
        String absolutePath = new File(relativePath).getAbsolutePath();
        photoAlbum.addPhoto(absolutePath);
    }

    public PhotoAlbum getPhotoAlbum(){
        return photoAlbum;
    }

    public void makeUnavaliable(){
        isAvaliable=false;
    }

    public void makeAvaliable(){
        isAvaliable=true;
    }



}

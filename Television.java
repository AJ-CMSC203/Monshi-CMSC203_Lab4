public class Television {

//fields

final private String MANUFACTURER;
final private int SCREEN_SIZE;
private boolean powerOn;
private int channel;
private int volume = 20;




//methods

//constructor
public Television(String brand, int size){
powerOn = false;
MANUFACTURER = brand;
SCREEN_SIZE = size;
}

//setter
public void setChannel(int station) {
this.channel = station;
}

//getters
public int getChannel() {
return channel;
}

public int getVolume() {
return volume;
}

public String getManufacturer() {
return MANUFACTURER;
}

public int getScreenSize() {
return SCREEN_SIZE;
}

//other
public void power() {
powerOn = !powerOn;
}

public void increaseVolume() {
volume++;
}

public void decreaseVolume() {
volume--;
}


}
package base;


public class Plant {
    public int watering;
    public String name;
    public String fam_name;
 Plant(int watering, String name){
    name= Newname;
    watering=Newwatering;
}


static void wateringperday(int watering,String name){
    System.out.println(name+"must be watered"+watering+"perday");
    
    }


static void sunlight(int watering,String name){
    int sun;
    sun = watering * 7;
    System.out.println( name +"must be put on sunlight not warmer than"+ sun+"celcius");

    }
}


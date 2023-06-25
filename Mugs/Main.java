package Mugs;
public class Main {
    public static void main(String[] args) {
        Mug yellowMug = new Mug();
        yellowMug.color = "sárga";
        yellowMug.volume = 3;
        yellowMug.hasHandle = true;
        yellowMug.refill("kávé");

    if(yellowMug.hasHandle) {
        System.out.println("Az én bögrém " + yellowMug.color + " színű, és a térfogata " + yellowMug.volume + " dl.");
    } else {
        System.out.println("Sajnos nem tudom használni a bögrémet, mert letört a füle.");
    }
       /*/ System.out.println(yellowMug);
        System.out.println(yellowMug.volume); */
    }
}
